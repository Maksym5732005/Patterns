package kotlin_patterns.strategy.behavior

class ConcreteStrategyA: Strategy {
    override fun operation() {
        println("perform operation A")
    }
}