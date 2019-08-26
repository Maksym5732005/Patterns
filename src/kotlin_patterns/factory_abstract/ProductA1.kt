package kotlin_patterns.factory_abstract

class ProductA1 : AbstractProductA {
    override fun showDescription() {
        println(javaClass.simpleName)
    }
}
