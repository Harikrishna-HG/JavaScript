public class Testthrows {
    public static int dividenum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    public static void main(String[] args) {
        Testthrows obj = new Testthrows();
        try {
            System.out.println(obj.dividenum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        }
    }
}
