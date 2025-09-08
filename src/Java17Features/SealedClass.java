//
// sealed keyword restricts which classes can extend Shape
// permits Circle, Rectangle lists the allowed subclasses.
//
//public sealed class Shape permits Circle, Rectangle {
//    public void draw() {
//        System.out.println("Drawing a shape.");
//    }
//}
//
//public final class Circle extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a circle.");
//    }
//}
//
//public final class Rectangle extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a rectangle.");
//    }
//}