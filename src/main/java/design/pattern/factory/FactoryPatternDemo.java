package design.pattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // 获取Circle的对象，并调用它的draw方法
        Shape shape1 = factory.getShape("circle");

        // 调用Circle的draw方法
        shape1.draw();

        // 获取Rectangle的对象，并调用它的draw方法
        Shape shape2 = factory.getShape("rectangle");

        // 调用Rectangle的draw方法
        shape2.draw();

        // 获取Square的对象，并调用它的draw方法
        Shape shape3 = factory.getShape("square");

        // 调用Square的draw方法
        shape3.draw();
    }
}
