
package behavioral.mediator;


public class Helicopter  extends Transport{

    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void send(String m) {
        System.out.println("Helicopter.send() - " + m );
        s.send(name, m);
    }

    @Override
    public void receive(String from, String m) {
        System.out.println("Helicopter.receive() - " + m + " from " + from);
    }
    
}
