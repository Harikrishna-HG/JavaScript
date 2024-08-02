class MyClass {
    // Instance variables
    int x;
    int y;

    MyClass(int x, int y) {
        this.x = x; 
        this.y = y; 
    }

    void display() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        
        MyClass obj = new MyClass(10, 20);

       
        obj.display(); 
    }
}
