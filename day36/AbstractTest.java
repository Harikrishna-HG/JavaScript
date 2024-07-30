abstract class Figure {
    float f1, f2;

    Figure(float a, float b) {
        f1 = a;
        f2 = b;
    }

    abstract float area();
}

class Rectangle extends Figure {
    Rectangle(float a, float b) {
        super(a, b);
    }

    float area() {
        System.out.println("Inside area of rectangle");
        return f1 * f2;
    }
}

class Triangle extends Figure {
    Triangle(float a, float b) {
        super(a, b);
    }

    float area() {
        System.out.println("Inside area of triangle");
        return (f1 * f2) / 2;
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(5, 5);
        
        Figure f;
        f = r;
        System.out.println("Area = " + f.area());
        
        f = t;
        System.out.println("Area = " + f.area());
    }
}
