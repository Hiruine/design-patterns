package creational.prototype;

public class Cronus implements Titan {

    private final String name = "Cronus";

    @Override
    public Titan clone() {
        return new Cronus();
    }

    @Override
    public String getName() {
        return name;
    }
}
