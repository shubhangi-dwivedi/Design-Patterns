public class ShapeFactory {
    Shape getShape(String input){
        //returning obj based on some condition
        switch (input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
