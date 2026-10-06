public class TextTools {
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
                count++;
            }
        }
        return count;
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

    public static void main(String[] args) {
        System.out.println("countVowels(\"Education\") = " + countVowels("Education"));
        System.out.println("countVowels(\"Java\") = " + countVowels("Java"));
        System.out.println("gradeLabel(85.0) = " + gradeLabel(85.0));
        System.out.println("gradeLabel(95.0) = " + gradeLabel(95.0));
    }
}
