public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("division by zero");
            return 0.0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("add(3,5) = " + add(3, 5));
        System.out.println("add(10,-2) = " + add(10, -2));
        System.out.println("multiply(4,6) = " + multiply(4, 6));
        System.out.println("multiply(7,3) = " + multiply(7, 3));
        System.out.println("divide(7,2) = " + divide(7, 2));
        System.out.println("divide(9,3) = " + divide(9, 3));
        System.out.println("divide(7,0) = " + divide(7, 0));
    }
}
