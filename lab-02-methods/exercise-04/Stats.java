public class Stats {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int max(int[] values) {
        int largest = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] values = {80, 90, 70, 100};
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("max = " + max(values));
    }
}
