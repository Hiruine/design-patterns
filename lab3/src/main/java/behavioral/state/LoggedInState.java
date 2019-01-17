
package behavioral.state;


public class LoggedInState implements State {

    @Override
    public void performOperation(String d) {
        System.out.println("Operation : " + d);
    }

    @Override
    public void logIn(String d) {
        System.out.println("Log out first.");
    }

    @Override
    public void logOut(String d) {
        System.out.println("Logged out.");
    }

}
