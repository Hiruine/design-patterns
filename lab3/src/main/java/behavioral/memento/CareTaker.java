
package behavioral.memento;

import java.util.Stack;


public class CareTaker {
  private Stack<Memento> states = new Stack<>();

  public void saveMemento(Memento m) {
    states.push(m);
  }

  public Memento restoreMemento() {
    return states.pop();
  }
}

