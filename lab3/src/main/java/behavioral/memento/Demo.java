
package behavioral.memento;


public class Demo {

    public static void main(String[] args) {
        Account a = new Account();
        CareTaker careTaker = new CareTaker();
        a.deposit(578);
        careTaker.saveMemento(a.getMemento());
        a.deposit(789);
        careTaker.saveMemento(a.getMemento());
        a.withdraw(205);
        careTaker.saveMemento(a.getMemento());

        System.out.println("Transactions : ");
        System.out.println(careTaker.restoreMemento());
        System.out.println(careTaker.restoreMemento());
        System.out.println(careTaker.restoreMemento());
    }
}
