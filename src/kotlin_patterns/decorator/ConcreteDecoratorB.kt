package kotlin_patterns.decorator

class ConcreteDecoratorB(component: Component) : Decorator(component) {
    override fun operation() {
        component.operation()
        newOperation()
    }

    private fun newOperation() {
        println("Additional action B")
    }
}