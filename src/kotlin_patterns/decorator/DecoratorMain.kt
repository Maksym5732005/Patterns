package kotlin_patterns.decorator

fun main() {
    var component: Component = ConcreteComponent().also { it.operation() }
    println("-------------------------------")
    component = ConcreteDecoratorA(component).also { it.operation() }
    println("-------------------------------")
    component = ConcreteDecoratorB(component).also { it.operation() }
}