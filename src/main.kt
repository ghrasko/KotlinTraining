import java.lang.Math.abs
import kotlin.math.*

val myName = "Gábor"

fun main(args: Array<String>) {
    var num1 = 12
    val num2 = 10

    val quotient:Double = num1.toDouble().div(num2)
    println("Quotient is $quotient")

    val neg = -145.7
    // val absolute = abs(neg)
    val absolute = Math.abs(neg)

    println("neg is $neg ant its absolute is $absolute")
    println("Rounded value is ${Math.round(absolute)}")

    println("neg is $neg ant its absolute is $absolute")
    println("Rounded value is ${absolute.roundToInt()}")

    println("Have a piece of $PI")
}
