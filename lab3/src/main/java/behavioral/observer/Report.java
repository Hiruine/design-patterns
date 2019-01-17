
package behavioral.observer;

import java.util.ArrayList;
import java.util.List;


public class Report {

    private String data;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setData(String d) {
        this.data = d;
        notifyObservers();

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}
