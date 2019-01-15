package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Tartarus {

    private static List<Titan> titans = new ArrayList<>();

    public static void addResident(Titan titan) {
        titans.add(titan);
    }

    public static Titan createResident(String name) {
        for (Titan titan : titans) {
            if(titan.getName().equals(name)) {
                System.out.println(name + " is in prison");
                return titan.clone();
            }
        }
        System.out.println(name + " doesn't exist");
        return null;
    }
}
