package kotlin_patterns.factory_method

interface Creator {
    fun createProduct(type: String): Product
}