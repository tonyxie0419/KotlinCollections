fun main(args: Array<String>) {
    println(shop.groupCustomersByCity())
}

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }