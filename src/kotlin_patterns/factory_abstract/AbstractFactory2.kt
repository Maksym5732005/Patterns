package kotlin_patterns.factory_abstract

class AbstractFactory2: AbstractFactory {
    override fun createProductA(): AbstractProductA {
        return ProductA2()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB2()
    }
}
