package creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        String validTitanName = "Cronus";
        String invalidTitanName = "Bandersnatch";

        initializePrototypes();
        Titan validTitan = Tartarus.createResident(validTitanName);
        System.out.println(validTitan.getName() + "\n");

        Tartarus.createResident(invalidTitanName);
    }

    public static void initializePrototypes() {
        Tartarus.addResident(new Cronus());
        Tartarus.addResident(new Hyperion());
    }
}
