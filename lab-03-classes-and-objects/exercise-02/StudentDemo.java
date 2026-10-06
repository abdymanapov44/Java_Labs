public class StudentDemo {
    public static void main(String[] args) {
        Student first = new Student("Ada", 1001);
        Student second = new Student("Alan", 1002);

        System.out.println(first.name + " #" + first.id);
        System.out.println(second.name + " #" + second.id);
    }
}
