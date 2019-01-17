
package behavioral.observer;


public class ThreeDimensionalGraph implements Observer {

    @Override
    public void update(String data) {
        System.out.println("ThreeDimensionalGraph.update() - " + data);
    }

}
