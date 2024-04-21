package day45;

public class MainShape
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area of the Circle: " + circle.area());
        System.out.println("Area of the Rectangle: " + rectangle.area());
    }
}
