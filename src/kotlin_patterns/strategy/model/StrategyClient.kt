package kotlin_patterns.strategy.model

import kotlin_patterns.strategy.behavior.Strategy

class StrategyClient (var strategy: Strategy) {

    fun performOperation() {
        strategy.operation()
    }
}