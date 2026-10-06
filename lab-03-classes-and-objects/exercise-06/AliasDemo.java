public class AliasDemo {
    public static void main(String[] args) {
        Student a = new Student("Ada", 1);
        Student b = new Student("Alan", 2);
        b = a;
        b.name = "Augusta";
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

/*
After b = a, both variables store the same reference and point to the same Student object.
Changing b.name changes that shared object, so a.name has the same value.
The Student object previously referenced by b is no longer reachable if no other reference points to it.
That object then becomes eligible for garbage collection.
With int, assignment copies the primitive value itself, so changing one variable does not change the other.
*/
