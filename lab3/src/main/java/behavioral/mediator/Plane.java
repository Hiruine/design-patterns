
package behavioral.mediator;


public class Plane extends Transport{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void send(String m) {
        System.out.println("Plane.send() - " + m );
        s.send(name, m);
    }

    @Override
    public void receive(String from, String m) {
        System.out.println("Plane.receive() - " + m + " from " + from);
    }
    
}
