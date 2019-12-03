val myName = "Gábor"

fun main(args: Array<String>) {
    val i = 3.toDouble()

    println("Hello ${args[0]}")
    println("The first argument is " + args[0])
    println("i is a simple number: $i")
    println("My name is $myName")

    println("The type of i is ${i::class.simpleName}")
    println("The qualified name of i is ${i::class.qualifiedName}")

    var num1 = 12
    val num2 = 10

    val match:Boolean = (num1 == num2)
    println("Match = $match")

//    val match2:Boolean = num1.equals(num2)
//    println("Match2 = $match2")

    println("Comparison result = ${num1.compareTo(num2)}")

    num1++
    println("Increased num1 is $num1")
}
