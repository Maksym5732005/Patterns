package kotlin_patterns.factory_method

class ConcreteCreator : Creator {
    override fun createProduct(type: String): Product {
        return when(type) {
            "some type" -> ConcreteProduct()
            else -> ConcreteProduct()
        }
    }
}