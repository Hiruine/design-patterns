package creational.factorymethod;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        Elf elf = null;

        elf = ElfFactory.conceiveElf(ElfRace.HIGH);
        elf.trainSpeciality();

        elf = ElfFactory.conceiveElf(ElfRace.WILD);
        elf.trainSpeciality();

        elf = ElfFactory.conceiveElf(ElfRace.DARK);
        elf.trainSpeciality();
    }
}
