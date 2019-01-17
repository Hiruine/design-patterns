
package behavioral.visitor;


public class Teenager implements Visitable {

    @Override
    public void accept(Visitor v) {
        v.visitTeenager(this);
    }

}
