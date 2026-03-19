public class Dog extends Animal {
    public Dog() {}

    @Override
    public void emitSound() {
        System.out.println("Auau!");;
    }

    public void wagTail() {
        System.out.println("Wagging Tail");
    }
}
