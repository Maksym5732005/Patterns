package kotlin_patterns.decorator

class ConcreteComponent: Component {
    override fun operation() {
        println("Main action")
    }
}