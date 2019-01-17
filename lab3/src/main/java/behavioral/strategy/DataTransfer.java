
package behavioral.strategy;


public class DataTransfer {

    private Protocol p;

    public void setP(Protocol p) {
        this.p = p;
    }

    public void sendStream() {
        if (p != null) {
            p.transfer();
        }
    }

}
