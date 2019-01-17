
package behavioral.visitor;


public class Demo {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Teenager());
        b.add(new Teenager());
        b.add(new Teenager());
        b.add(new Teenager());
        TaxVisitor t = new TaxVisitor();
        b.visitPassenger(t);
    }
}
