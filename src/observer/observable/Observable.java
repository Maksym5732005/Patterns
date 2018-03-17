package observer.observable;

import observer.objects.Observer;

public interface Observable {

    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();

    void setChanged();
}
