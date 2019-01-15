package creational.abstractfactory;

import creational.abstractfactory.elf.ElfKingdomFactory;
import creational.abstractfactory.orc.OrcKingdomFactory;

public abstract class KingdomFactory {

    public static KingdomFactory getFactory(Race race) {
        switch (race) {
            case ELF: {
                return new ElfKingdomFactory();
            }
            case ORC: {
                return new OrcKingdomFactory();
            }
        }
        return null;
    }

    public abstract Castle createCastle();

    public abstract King createKing();

    public abstract Army createArmy();

}
