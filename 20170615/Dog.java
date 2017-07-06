public abstract class Dog extends Animal {
    private boolean isWaggingTail;

    public Dog(String name, boolean isWaggingTail) {
        super(name);
        this.isWaggingTail = isWaggingTail;
    }

    public boolean getIsWaggingTail() {
        return isWaggingTail;
    }

    public abstract void bark();

    //Speak is inherited for Dog, but it is still abstract since
    //we did not override it.

}