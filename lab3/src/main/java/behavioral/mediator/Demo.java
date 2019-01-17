
package behavioral.mediator;


public class Demo {
    public static void main(String[] args) {
        Station s = new Station();
        final Plane plane = new Plane("Boieng 745");
        s.registerTransport(plane);
        final Helicopter helicopter = new Helicopter("Apache 598");
        s.registerTransport(helicopter);
        plane.send("Hi");
        helicopter.send("Hi");
    }
}
