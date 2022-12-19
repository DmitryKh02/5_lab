
/**
 * @author Dmitrii Khokhlov
 * @version 3.2
 */

/** 
     * @see Triangle#printFigure()
     * @see Triangle#calculatePerimetr()
     * @see Triangle#calculateSquare()
     * 
     * @see Circle#printFigure()
     * @see Circle#calculatePerimetr()
     * 
     * @see Rectangle#calculatePerimetr()
     * @see Rectangle#calculateSquare()
     * 
     * @see Vectors#selectType()
    */
public class Shapes {

    @AutoInjectable
    public Print print;

    @Type
    private GraphicsType graphicsType;

    @AutoInjectable
    private Square square;

    @AutoInjectable
    private Perimetr perimetr;

    public void createShapes(){
        print.printFigure();

        graphicsType.selectType();

        square.calculateSquare();

        perimetr.calculatePerimetr();
    }
}

/**
 * @category interfaces
 */
interface GraphicsType{
    public void selectType();
}

interface Print{
    public void printFigure();
}

interface Square{
    public void calculateSquare();
}

interface Perimetr{
    public void calculatePerimetr();
}