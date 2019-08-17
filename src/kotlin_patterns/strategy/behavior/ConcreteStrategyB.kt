package kotlin_patterns.strategy.behavior

class ConcreteStrategyB: Strategy {
    override fun operation() {
        println("perform operation B")
    }
}