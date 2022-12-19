import java.util.Arrays;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;


public class Injector {
    /**
     * @param object - some empty class
     * @return object - filled class object
     * @exception IOException - error in loading property information
     * @exception InstantiationException - specified class object cannot be instantiated
     * @exception IllegalAccessException - executing method does not have access to the definition of the specified class, field, method or constructor
     * @exception ClassNotFoundException - definition for the class with the specified name could be found
     */
    public Object inject(Object object) {
        if (object != null) { //Check object
            Class<?> myClass = object.getClass();
            System.out.println(myClass);

            System.out.println("Поля класса: " + Arrays.toString(myClass.getDeclaredFields()));
            System.out.println("Методы класса: " + Arrays.toString(myClass.getDeclaredMethods())); //Print filds and methods

            Properties property = new Properties(); //Create Property 
            String propFileName = "init.properties";

            InputStream inputStream = myClass.getClassLoader().getResourceAsStream(propFileName); //Get all information in Input Stream

            try {
                property.load(inputStream);

                for (Field field : myClass.getDeclaredFields()) { //Get all fields of input class
                    AutoInjectable myAnnotation = field.getAnnotation(AutoInjectable.class); //Create annotation instance
                    Type mType = field.getAnnotation(Type.class);

                    // if(myAnnotation != null) - IT IS NOT GOING TO WORK!!!(Because the GraphicsType field will not be defined!!!)
                    if (myAnnotation != null || mType != null) { //Check input field annotation
                        field.setAccessible(true); //Making the field writable 

                        String className = property.getProperty(field.getName()); //Get new class name from property 

                        try {
                            Object value = Class.forName(className).newInstance();//Try create class instance by name
                            field.set(object, value); //set input class fild by new class instance
                        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return object; //Return filled class
    }
}
