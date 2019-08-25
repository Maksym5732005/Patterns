package kotlin_patterns.observer

class ConcreteObservable: Observable {
    var data = 25
        set(value) {
            field = value
            notifyObservers()
        }

    private var observers: MutableList<Observer> = mutableListOf()

    override fun addObserver(o: Observer) {
        if (!observers.contains(o)) observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { it.update() }
    }
}