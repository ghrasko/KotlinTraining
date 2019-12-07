fun main(args: Array<String>) {

    println("--------- STRING ARRAY ---------")
    val strings1 = arrayOf("red", "green", "blue")
    for (element in strings1) {
        println(element)
    }
    println("---------- MIXED ARRAY --------")

    val mixed1 = arrayOf("red", 12, "blue")
    for (element in mixed1) {
        println(element)
    }

    println("----------- NULL ARRAY -------")
    val nulls1 = arrayOfNulls<String>(3)
    for (element in nulls1) {
        println(element)
    }

    println("----------- NULL ARRAY ASSIGNMENT -------")
    nulls1[0] = "black"
    nulls1[1] = "white"
    nulls1.set(2, "purple")
    for (element in nulls1) {
        println(element)
    }

    println("----------- INT ARRAY -------")
    val ints1 = intArrayOf(1, 2, 3, 5, 7, 11, 13, 17)
    for (element in ints1) {
        println(element)
    }

    println("----------- SORT ARRAY -------")
    strings1.sort()
    for (element in strings1) {
        println(element)
    }

    println("----------- SORT ARRAY DESCENDING -------")
    ints1.sortDescending()
        for (element in ints1) {
        println(element)
    }

    println("----------- SORT ARRAY INTO NEW ARRAY -------")
    val strings2 = strings1.sorted()
    for (element in strings2) {
        println(element)
    }

    println("----------- RANDOMIZE INT ARRAY -------")
    for (i in 1..3) {
        println("$i: ${ints1.random()}")
    }

}


