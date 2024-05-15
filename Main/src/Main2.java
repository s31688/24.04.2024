public class Main2 {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    }
}

interface Moveable {
    void start();

    void stop();
}

abstract class Animal {
    private String type;

    public Animal() {

    }

    public String getType() {
        return null;
    }

    public String getName() {
        return null;
    }
}

class Cat extends Animal implements Moveable {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getName() + " starts!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getName() + " stopped!");
    }
}