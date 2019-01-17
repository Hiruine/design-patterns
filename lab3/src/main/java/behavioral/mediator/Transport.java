
package behavioral.mediator;


public abstract class Transport {

    protected String name;
    protected Station s;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Station getS() {
        return s;
    }

    public void setStation(Station s) {
        this.s = s;
    }

    public abstract void send(String m);

    public abstract void receive(String from, String m);
}
