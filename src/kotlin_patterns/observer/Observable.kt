package kotlin_patterns.observer

interface Observable {
    fun addObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}