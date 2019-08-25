package kotlin_patterns.observer

class ConcreteObserver(val observable: Observable) : Observer {

    init { observable.addObserver(this) }

    override fun update() {
        (observable as? ConcreteObservable)?.let {
            println("update = ${it.data}")
        }
    }
}