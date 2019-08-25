package kotlin_patterns.observer

fun main() {
    val subject = ConcreteObservable()
    ConcreteObserver(subject)

    subject.data = 25
    subject.data = 7
}