
package behavioral.strategy;


public class Demo {
    public static void main(String[] args) {
        DataTransfer dt = new DataTransfer();
        dt.setP(new UDP());
        dt.sendStream();
        dt.setP(new TCP());
        dt.sendStream();
    }
}
