public class SimpleMenu {
    public static void main(String[] args) {
        int choice;
        int step = 1;

        // Test sequence: 1, 2, 4, 3.
        do {
            System.out.println("1) Show greeting");
            System.out.println("2) Show a number squared");
            System.out.println("3) Quit");

            if (step == 1) {
                choice = 1;
            } else if (step == 2) {
                choice = 2;
            } else if (step == 3) {
                choice = 4;
            } else {
                choice = 3;
            }
            step++;

            switch (choice) {
                case 1:
                    System.out.println("Hello, Java student!");
                    break;
                case 2:
                    int x = 6;
                    System.out.println(x * x);
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Unknown option");
            }

            if (choice != 3) {
                System.out.println();
            }
        } while (choice != 3);
    }
}
