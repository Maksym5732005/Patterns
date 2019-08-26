package kotlin_patterns.factory_abstract

class ProductB2 : AbstractProductB {
    override fun showDescription() {
        println(javaClass.simpleName)
    }
}
