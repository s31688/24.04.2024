public class Main2 {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    }
}

interface moveable {
    void start();

    void stop();
}

abstract class Animal implements moveable {
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

class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().toString() + " starts!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.getClass().toString();
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().toString() + " stopped!");
    }
}