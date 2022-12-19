/**
 * @see interface{@link #calculatePerimetr()}
 * @see interface{@link #calculateSquare()}
 */
public class Rectangle implements Perimetr, Square{
    @Override
    public void calculateSquare() {
        System.out.println("S = a * b");
    }

    @Override
    public void calculatePerimetr() {
        System.out.println("P = 2 * (a + b)");
    }
    
}
