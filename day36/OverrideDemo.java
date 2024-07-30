class A {
    int i, j;

    A(int x, int y) {
        i = x;
        j = y;
    }

    void display() {
        System.out.println("i and j: " + i + ", " + j);
    }
}

class B extends A {
    int k;

    B(int x, int y, int z) {
        super(x, y);
        k = z;
    }

    @Override
    void display() {
        super.display(); // Calling the superclass display method
        System.out.println("k: " + k);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        B subObj = new B(10, 20, 30);
        subObj.display();
    }
}
