
package behavioral.observer;


public class Demo {

    public static void main(String[] args) {
        TwoDimensionalGraph twoDimensionalGraph = new TwoDimensionalGraph();
        ThreeDimensionalGraph threeDimensionalGraph = new ThreeDimensionalGraph();

        Report report = new Report();
        report.addObserver(twoDimensionalGraph);
        report.addObserver(threeDimensionalGraph);
        report.setData("X=1,Y=2");

    }
}
