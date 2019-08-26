package kotlin_patterns.factory_abstract

class ProductB1 : AbstractProductB {
    override fun showDescription() {
        println(javaClass.simpleName)
    }
}
