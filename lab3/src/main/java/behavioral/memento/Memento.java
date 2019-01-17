
package behavioral.memento;


public class Memento {

    private double balance;

    public Memento(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Memento{" + "balance=" + balance + '}';
    }

}
