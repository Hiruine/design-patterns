package creational.singleton;

public class TimeStone {

    public static final TimeStone INSTANCE = new TimeStone();

    private TimeStone() {
    }

    public void manipulateTime() {
        System.out.println("Dormammu i've come to bargain");
    }

   public static TimeStone getInstance() {
        return TimeStone.INSTANCE;
   }
}
