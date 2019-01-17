
package behavioral.mediator;

import java.util.Collection;
import java.util.HashMap;


public class Station {
    private HashMap<String, Transport> transports = new HashMap<>();
    
    public void registerTransport(Transport t){
        transports.putIfAbsent(t.getName(), t);
        t.setStation(this);
    }
    
    public void send(String fr, String m){
        Collection<Transport> values = transports.values();
        for (Transport value : values) {
            if(value.getName().equals(fr)){
                value.receive(fr, m);
            }
        }
    }
}
