class MyClass {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Static Method called");
    }
}

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Static Variable: " + MyClass.staticVariable);

        MyClass.staticMethod();
    }
}
