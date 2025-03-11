import java.lang.Math;

class Circle{
    protected int radius;

    protected Circle(int radius){
        this.radius = radius;
    }

    protected Circle(){
        this.radius = 0;
    }

    protected double getCircumference(){
        double circumference = Math.PI * radius * radius;
        System.out.printf("Circumference of the circle is %.2f\n", circumference);
        return circumference;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius = 3;
        Circle circle1 = new Circle(radius);
        circle1.getCircumference();

        Circle circle2 = new Circle();
        circle2.getCircumference();

//        Circumference of the circle is 28.27
//        Circumference of the circle is 0.00
    }
}