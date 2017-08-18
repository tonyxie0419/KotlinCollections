fun main(args: Array<String>) {
    println(setOf(idea))
    println(customerAfter[reka]!!.orderedProducts)//!!表示非空

    println(orderedProducts)
    println(shop.allOrderedProducts)
}

// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product>
    get() {
        return orders.flatMap { it.products }.toSet()
    }

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product>
    get() {
        return customers.flatMap { it.orderedProducts }.toSet()
    }