package kotlin_patterns.strategy

import kotlin_patterns.strategy.behavior.ConcreteStrategyA
import kotlin_patterns.strategy.behavior.ConcreteStrategyB
import kotlin_patterns.strategy.model.StrategyClient

fun main(args: Array<String>) {

    val client = StrategyClient(ConcreteStrategyA())
    client.performOperation()
    client.strategy = ConcreteStrategyB()
    client.performOperation()
}