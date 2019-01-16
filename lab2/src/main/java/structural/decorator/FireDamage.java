package structural.decorator;

public class FireDamage extends Decorator {

    public FireDamage(Damage damage) {
        super(damage);
    }

    @Override
    public void enhance() {
        addFireBreath();
        super.enhance();
    }

    public void addFireBreath() {
        System.out.println("fire damage");
    }

}
