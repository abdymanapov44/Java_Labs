public class Countdown {
    public static void main(String[] args) {
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Lift off!");

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");
    }
}
