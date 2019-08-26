package java_patterns.observer.observable;

import java_patterns.observer.objects.Observer;

public interface Observable {

    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();

    void setChanged();
}
