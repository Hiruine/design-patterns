package structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Damage damage = new PhysicalDamage();

        FireDamage fireDamage = new FireDamage(damage);
        MagicDamage magicDamage = new MagicDamage(fireDamage);

        magicDamage.enhance();

    }
}
