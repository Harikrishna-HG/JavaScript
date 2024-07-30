public class throwtest {
    public static void checksum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Num is negative");
        } else {
            System.out.println("Square of " + num + " = " + (num * num));
        }
    }

    public static void main(String[] args) {
        throwtest t = new throwtest();
        t.checksum(-3);
    }
}
