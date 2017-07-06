import java.util.Arrays;

public class Person implements Comparable<Person> {
    // To implement: Comparable<E>
    // The E stands for the object type you want to compare.
    // <E> means you want to compare 2 instances of the same type
    // it does the instanceof check for you
    // To implement Comparable<Person> would compare your object
    // to a Person object.

    // Online javadocs has Comparable<T>, but <T> and <E> are
    // interchangeable.

    // You will need to know Comparator interface later

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //Format for the compareTo method:
    //public int compareTo(<T>, o);
    public int compareTo(Person other) {
        // will return -1, 0, or 1

        if (age < other.getAge()) {
            return -1;
        } else if (age > other.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(19, "p1");
        Person p2 = new Person(9, "p2");
        Person p3 = new Person(5, "p3");
        Person p4 = new Person(0, "p4");

        Person[] people = {p1,p2,p3,p4};

        Arrays.sort(people);
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}