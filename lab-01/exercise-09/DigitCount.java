public class DigitCount {
    public static void main(String[] args) {
        int number = 50280;
        int remaining = number;
        int digits = 0;

        if (remaining == 0) {
            digits = 1;
        } else {
            while (remaining > 0) {
                remaining /= 10;
                digits++;
            }
        }

        System.out.println("Digits: " + digits);
    }
}
