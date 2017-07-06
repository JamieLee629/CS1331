public class Watermelon implements Comparable {
    private int weight;

    public Watermelon(int weight) {
        this.weight = weight;
        if (weight > 500) {
            throw new DeformedWatermelonException("Watermelon too big!");
        }
    }

    public int compareTo(Watermelon other) {
        return this.weight - other.weight;
    }
}