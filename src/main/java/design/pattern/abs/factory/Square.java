package design.pattern.abs.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
