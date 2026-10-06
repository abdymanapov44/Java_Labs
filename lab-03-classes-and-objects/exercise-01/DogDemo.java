public class DogDemo {
    public static void main(String[] args) {
        Dog first = new Dog();
        first.name = "Rex";
        first.age = 3;

        Dog second = new Dog();
        second.name = "Bella";
        second.age = 5;

        System.out.println(first.name + " " + first.age);
        System.out.println(second.name + " " + second.age);
    }
}
