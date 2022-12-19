# My Program

## Structure

I created a Form class with 4 fields: Print, GraphicsType, Square and Perimeter. Fields 1, 3,4 were marked with the AutoInjectable annotation and field 2 was marked with the Type annotation.

These fields are interfaces of the Triangle, Rectangle, Circle and Vector classesThese fields are interfaces of the Triangle, Rectangle, Circle and Vector classes.

All classes implement the Perimeter interface.
The Triangle and Circle classes implement Printing interfaces. The Triangle and Rectangle classes implement the Square interfaces.

Vectors class implement the GraphicsType interface.

In the properties file I wrote the following:

print =Triangle

graphicsType =Vectors

square =Rectangle

perimetr =Circle

### Injector class

See the Injector class
