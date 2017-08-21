fun main(args: Array<String>) {
    println(customerAfter[nathan]!!.getTotalOrderPrice())

    println(customerAfter[lucas]!!.getTotalOrderPrice())
}

// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.flatMap { it.products }.sumByDouble { it.price }