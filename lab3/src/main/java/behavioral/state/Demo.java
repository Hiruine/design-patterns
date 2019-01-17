
package behavioral.state;


public class Demo {

    public static void main(String[] args) {
        App app = new App();
        app.setState(new LoggedOutState());
        app.performOperation("Help");
        app.logIn("Jack");
        app.setState(new LoggedInState());
        app.logIn("Jack");
        app.logOut("Jack");
    }
}
