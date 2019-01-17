
package behavioral.visitor;


public class Adult implements Visitable {

    @Override
    public void accept(Visitor v) {
        v.visitAdult(this);
    }

}
