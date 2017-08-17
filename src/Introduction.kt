fun main(args: Array<String>) {
    fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()
    println(customerAfter.values.toSet())
    println(shop.getSetOfCustomers())
}