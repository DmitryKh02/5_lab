/**
 * @see interface{@link #printFigure()}
 * @see interface{@link #calculatePerimetr()}
 * @see interface{@link #calculateSquare()}
 */
public class Triangle implements Perimetr, Square, Print{
    @Override
    public void printFigure() {
        System.out.println("Triangle!");
    }

    @Override
    public void calculateSquare() {
        System.out.println("S = 1/2 * b * h");
    }

    @Override
    public void calculatePerimetr() {
        System.out.println("P = a + b + c");        
    }
    
}
