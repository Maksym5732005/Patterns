package java_patterns.observer.objects;

import java_patterns.observer.observable.Observable;

public interface Observer {

    void update(Observable o);
}
