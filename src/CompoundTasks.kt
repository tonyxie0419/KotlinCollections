fun main(args: Array<String>) {
    println(testShop1.customers[0].getMostExpensiveDeliveredProduct())

    println(shop.getNumberOfTimesProductWasOrdered(idea))
}

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.getOrderedProductsList() }.count { it == product }
}

fun Customer.getOrderedProductsList(): List<Product> {
    return orders.flatMap { it.products }
}

val testShop1 = shop("test shop for 'most expensive delivered product'",
        customer(lucas, Canberra,
                order(isDelivered = false, products = idea),
                order(reSharper)
        ))