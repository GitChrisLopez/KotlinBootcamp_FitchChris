fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    //Filter all the curries by length
    val filteredCurries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(filteredCurries)

    //Return all the spices that start with 'c' and end in 'e'.
    //1
    val filteredSpices1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(filteredSpices1)

    //2
    val filteredSpices2 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println(filteredSpices2)

    //Take the first three elements of the list and return the ones that start with 'c'
    val first3Elements = spices.take(3).filter{it.startsWith('c')}
    println(first3Elements)
}