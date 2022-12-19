/**
 * @see interface{@link #calculatePerimetr()}
 * @see interface{@link #printFigure()}
 */
public class Circle implements Perimetr, Print{
    @Override
    public void printFigure() {
        System.out.println("Circle!");
    }

    @Override
    public void calculatePerimetr() {
        System.out.println("P = 2 * PI * R");
    }
    
}
