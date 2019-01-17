
package behavioral.strategy;


public class TCP implements Protocol {

    @Override
    public void transfer() {
        System.out.println("TCP.transfer()");
    }

}
