package design.pattern.abs.factory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProcedure.getFactory("SHAPE");

        // 获取形状为circle的对象
        Shape shape = shapeFactory.getShape("circle");

        // 调用circle的draw方法
        shape.draw();

        // 获取形状为rectangle的对象
        Shape shape1 = shapeFactory.getShape("rectangle");

        // 调用rectangle的draw方法
        shape1.draw();

        // 获取形状为Square的对象
        Shape shape2 = shapeFactory.getShape("square");

        // 调用square的draw方法
        shape2.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProcedure.getFactory("color");

        // 获取颜色为red的对象
        Color color = colorFactory.getColor("red");

        // 调用red的fill方法
        color.fill();

        // 获取颜色为green的对象
        Color color1 = colorFactory.getColor("green");

        // 调用green的fill方法
        color1.fill();

        // 获取颜色为blue的对象
        Color color2 = colorFactory.getColor("blue");

        // 调用blue的fill方法
        color2.fill();
    }
}
