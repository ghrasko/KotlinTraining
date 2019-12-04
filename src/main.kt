import java.math.BigDecimal
import kotlin.NumberFormatException

fun main(args: Array<String>) {
    try {

        val mathLib = MathLib()

        while(true) {
            val num: Double = MathLib.getNumInput("Enter a number: ")
            mathLib.addValue(num)
            println("The new sum is ${mathLib.runningTotal}")
        }
    }
    catch(e: KotlinNullPointerException) {                  // One can imitate this by typing Ctrl-D
        println("ERROR: Input is missing or unexpectedly terminated.")
    }
    catch(e: NumberFormatException) {
        println("ERROR: Not a valid number format: ${e.message}")
    }
    catch(e: ArithmeticException) {                         // Will never happen with double variables
        println("ERROR: Division by zero.")
    }
    catch(e: Exception) {
        println("ERROR: ${e.message}")
    }
}


