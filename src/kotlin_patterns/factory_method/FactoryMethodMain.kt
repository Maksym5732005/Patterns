package kotlin_patterns.factory_method

fun main() {
    val product = ConcreteCreator().createProduct("")
    println(product.getDescription())
}