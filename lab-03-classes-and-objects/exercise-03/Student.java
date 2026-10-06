public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printSummary() {
        System.out.println(name + " (id " + id + ")");
    }
}
