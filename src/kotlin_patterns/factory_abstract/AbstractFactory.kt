package kotlin_patterns.factory_abstract

interface AbstractFactory {
    fun createProductA(): AbstractProductA
    fun createProductB(): AbstractProductB
}