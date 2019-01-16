package structural.decorator;

public abstract class Decorator implements Damage {

    Damage damage;

    public Decorator(Damage damage) {
        this.damage = damage;
        System.out.println("decorator init");
    }

    @Override
    public void enhance() {
        damage.enhance();
        System.out.println("decorator enhance");
    }
}
