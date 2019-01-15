package creational.abstractfactory.orc;

import creational.abstractfactory.King;

public class OrcKing implements King {
    @Override
    public String getDescription() {
        return "orc king";
    }
}
