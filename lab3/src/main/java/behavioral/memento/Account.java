
package behavioral.memento;


public class Account {

    private double balance;

    public void deposit(double a) {
        balance += a;
        System.out.println("cAccount.deposit() +" + a);
        System.out.println(balance);
    }

    public void withdraw(double a) {
        balance -= a;
        System.out.println("Account.withdraw() -" + a);
        System.out.println(balance);
    }

    public Memento getMemento() {
        return new Memento(balance);
    }

    public void setMemento(Memento memento) {
        this.balance = memento.getBalance();
    }

}
