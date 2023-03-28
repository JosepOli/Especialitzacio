package borsa_observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

	List<Observer> observers = new ArrayList<>();

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
	
}
