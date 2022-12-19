public class Main {
    public static void main(String[] args) throws Exception {
        Injector inj = new Injector();
        Shapes example = (Shapes) inj.inject(new Shapes());
        example.createShapes();
    }
}
