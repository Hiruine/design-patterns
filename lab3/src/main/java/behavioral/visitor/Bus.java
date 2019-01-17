
package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;


public class Bus {

    List<Visitable> passengers = new ArrayList<>();

    public void visitPassenger(Visitor v) {
        for (Visitable passenger : passengers) {
            passenger.accept(v);
        }
    }

    public void add(Visitable v) {
        passengers.add(v);
    }
}
