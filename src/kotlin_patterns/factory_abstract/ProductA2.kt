package kotlin_patterns.factory_abstract

class ProductA2 : AbstractProductA {
    override fun showDescription() {
        println(javaClass.simpleName)
    }
}
