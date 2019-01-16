package structural.decorator;

public class PhysicalDamage implements Damage {
    @Override
    public void enhance() {
        System.out.println("physical damage");
    }
}
