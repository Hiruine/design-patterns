package creational.prototype;

public class Hyperion implements Titan {

    private final String name = "Hyperion";

    @Override
    public Titan clone() {
        return new Hyperion();
    }

    @Override
    public String getName() {
        return name;
    }
}
