
package behavioral.observer;


public class TwoDimensionalGraph implements Observer {

    @Override
    public void update(String data) {
        System.out.println("TwoDimensionalGraph.update() - " + data);
    }

}
