
package behavioral.state;


public class App {

    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void logIn(String d) {
        state.logIn(d);
    }

    public void logOut(String d) {
        state.logOut(d);
    }

    public void performOperation(String d) {
        state.performOperation(d);
    }
}
