public class TicketPrice {
    public static void main(String[] args) {
        double basePrice = 12.0;
        double price;
        int age;
        boolean isStudent;

        age = 10;
        isStudent = true;
        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else if (isStudent) {
            price = 9.0;
        } else {
            price = basePrice;
        }
        System.out.println("Price: " + price);

        age = 70;
        isStudent = false;
        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else if (isStudent) {
            price = 9.0;
        } else {
            price = basePrice;
        }
        System.out.println("Price: " + price);

        age = 20;
        isStudent = true;
        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else if (isStudent) {
            price = 9.0;
        } else {
            price = basePrice;
        }
        System.out.println("Price: " + price);

        age = 30;
        isStudent = false;
        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else if (isStudent) {
            price = 9.0;
        } else {
            price = basePrice;
        }
        System.out.println("Price: " + price);
    }
}
