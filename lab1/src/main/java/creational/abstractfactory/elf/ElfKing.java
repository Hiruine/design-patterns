package creational.abstractfactory.elf;

import creational.abstractfactory.King;

public class ElfKing implements King {
    @Override
    public String getDescription() {
        return "elf king";
    }
}
