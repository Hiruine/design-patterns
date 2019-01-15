package creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        KingdomFactory kingdom = KingdomFactory.getFactory(Race.ELF);
        King king = kingdom.createKing();
        System.out.println(king.getDescription());

        kingdom = KingdomFactory.getFactory(Race.ORC);
        Army army = kingdom.createArmy();
        System.out.println(army.getDescription());
    }
}
