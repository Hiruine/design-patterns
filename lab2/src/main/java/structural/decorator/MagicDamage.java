package structural.decorator;

public class MagicDamage extends Decorator {

    public MagicDamage(Damage damage) {
        super(damage);
    }

    @Override
    public void enhance() {
        addSpell();
        super.enhance();
    }

    public void addSpell() {
        System.out.println("magic damage");
    }
}
