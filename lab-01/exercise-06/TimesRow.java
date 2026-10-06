public class TimesRow {
    public static void main(String[] args) {
        int factor = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.print(factor * i);
            if (i < 10) {
                System.out.print(" ");
            }
        }
        System.out.println();

        int i = 1;
        while (i <= 10) {
            System.out.print(factor * i);
            if (i < 10) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();
    }
}
