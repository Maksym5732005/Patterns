package observer.objects;

import observer.observable.Observable;

public interface Observer {

    void update(Observable o);
}
