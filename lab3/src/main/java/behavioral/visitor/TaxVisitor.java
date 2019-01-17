
package behavioral.visitor;


public class TaxVisitor extends Visitor {

    @Override
    public void visitTeenager(Teenager t) {
        System.out.println("TaxVisitor.visitTeenager(). Fee = 3 lei.");
    }

    @Override
    public void visitAdult(Adult a) {
        System.out.println("TaxVisitor.visitAdult(). Fee = 5 lei.");
    }

}
