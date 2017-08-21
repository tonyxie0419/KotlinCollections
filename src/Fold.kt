fun main(args: Array<String>) {
    println(testShop.getSetOfProductsOrderedByEveryCustomer())
}

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap { it.orders.flatMap { it.products } }.toSet()
    return customers.fold(allProducts, { orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}

val testShop = shop("test shop for 'fold'",
        customer(lucas, Canberra,
                order(idea),
                order(webStorm)
        ),
        customer(reka, Budapest,
                order(idea),
                order(youTrack)
        )
)