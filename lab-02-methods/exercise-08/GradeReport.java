public class GradeReport {
    public static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static String gradeLabel(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else {
            return "Keep practising";
        }
    }

    public static void printReport(String courseName, int[] scores) {
        double avg = average(scores);
        int aboveAverage = 0;

        for (int score : scores) {
            if (score > avg) {
                aboveAverage++;
            }
        }

        System.out.println("Course: " + courseName);
        System.out.println("Average: " + avg);
        System.out.println("Label: " + gradeLabel(avg));
        System.out.println("Above average: " + aboveAverage);
    }

    public static void main(String[] args) {
        int[] cs101 = {80, 90, 70, 100};
        int[] cs102 = {90, 95, 92, 93};

        printReport("CS101", cs101);
        System.out.println();
        printReport("CS102", cs102);
    }
}
