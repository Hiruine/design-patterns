
package behavioral.strategy;


public class UDP implements Protocol {

    @Override
    public void transfer() {
        System.out.println("UDP.transfer()");
    }

}
