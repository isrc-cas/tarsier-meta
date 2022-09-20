public class SealedTest {
    public static abstract sealed class Fruit permits Apple, Pear {
    }

    public static non-sealed class Apple extends Fruit {
    }

    public static final class Pear extends Fruit {
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Pear pear = new Pear();
        Fruit fruit = apple;
        class Avocado extends Apple {};
        class RMOlive extends Fruit {};
    }
}
