package kotlin_patterns.factory_abstract

fun main() {
    val factory = AbstractFactory1()
    factory.createProductA().showDescription()
    factory.createProductB().showDescription()
}