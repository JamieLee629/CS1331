public class GermanShepherd extends Dog implements Guard /*, otherInterface1, otherinterface2*/ {
    private boolean isOnDuty;

    public GermanShepherd(String name, boolean isWaggingTail, boolean isOnDuty) {
        super(name, isWaggingTail);
        this.isOnDuty = isOnDuty;
    }

    // YOU MUST OVERRIDE BOTH ABSTRACT METHODS
    // in order for the code to compile.
    // it will error out otherwise.
    public void bark() {
        System.out.println("Woof!");
    }
    // public void speak() {
    //     bark();
    //     //Our speak and bark method will do the same thing.
    // }


    //Override the Guard method in the interface
    //Must use the exact same method signature or else you won't be overriding,
    //you'd be overloading.
    public void Guard() {
        System.out.println("Beware of Dog!");
    }
}