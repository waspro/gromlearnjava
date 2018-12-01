package lesson8.exercises.Exercise2;

public class Demo {
    public static void main(String[] args) {

        createHighestParent();
        createLowestChild();

    }

    public static Student createHighestParent() {
        Course[] ct = new Course[0];
        return new Student("Donald", "Duck", 3, ct);
    }

    public static SpecialStudent createLowestChild() {
        Course[] ct = new Course[0];
        return new SpecialStudent("Captain", "America", 3, ct, 123541, "cap@america.com");
    }
}