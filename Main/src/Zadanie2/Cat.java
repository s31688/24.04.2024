public class Cat extends Animal implements Moveable {
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