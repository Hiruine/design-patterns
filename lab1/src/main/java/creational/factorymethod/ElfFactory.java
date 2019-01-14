package creational.factorymethod;

public class ElfFactory {

    static Elf conceiveElf(ElfRace race) {
        switch (race) {
            case HIGH: {
                return new HighElf();
            }
            case DARK: {
                return new DarkElf();
            }
            case WILD: {
                return new WildElf();
            }
            default: {
                return null;
            }
        }
    }

}
