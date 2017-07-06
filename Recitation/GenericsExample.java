public class GenericsExample {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {new Integer(1), new Integer(2),
            new Integer(3)};

        System.out.println(contains(array, 3));
        
    }

    public static <T> boolean contains(T[] array, T element) {
        for (T item: array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}