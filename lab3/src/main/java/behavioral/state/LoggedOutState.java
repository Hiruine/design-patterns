
package behavioral.state;


public class LoggedOutState implements State {

    @Override
    public void performOperation(String d) {
        System.out.println("You can not perform operation. Log in.");
    }

    @Override
    public void logIn(String d) {
        System.out.println("Logged in.");
    }

    @Override
    public void logOut(String d) {
        System.out.println("Log in first.");
    }

}
