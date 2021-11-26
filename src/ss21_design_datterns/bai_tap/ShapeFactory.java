package ss21_design_datterns.bai_tap;

public class ShapeFactory {
    public Shape getShape(String theShape) {
        if ("vuong".equals(theShape)) {
            return new Square();
        } else if ("tron".equals(theShape)) {
            return new Circle();
        } else return new Rectangle();
    }
}
