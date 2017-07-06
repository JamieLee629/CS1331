import java.util.Arrays;

public class SortExample {
    
    // Comparable<E>
    // comparable interface
    // Comparable is the interface that String already implements by default
    // String, Integer, BigInteger...

    public static void main(String[] args) {
        String[] cities = {"Chicago", "New York", "London", "Baltimore", "Miami"};

        System.out.println("Before Sorting: ");
        for (String s : cities) {
            System.out.println(s);
        }

        Arrays.sort(cities);

        System.out.println("\nAfter sorting: ");
        for (String s : cities) {
            System.out.println(s);
        }
    }
}