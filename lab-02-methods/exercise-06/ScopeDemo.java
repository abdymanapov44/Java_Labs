public class ScopeDemo {
    public static int bump(int n) {
        n = n + 10;
        return n;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = bump(x);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*
Java passes an int argument by value, so bump receives a copy of x.
Changing n changes only that local copy, so x in main remains 5.
The parameter n and other local variables exist only inside the scope of bump.
They exist while the method call is active and are not visible from main.
*/
