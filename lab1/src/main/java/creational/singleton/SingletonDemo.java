package creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        TimeStone timeStone = TimeStone.getInstance();

        timeStone.manipulateTime();
    }
}
