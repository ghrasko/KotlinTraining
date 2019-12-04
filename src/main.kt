import kotlin.NumberFormatException

fun main(args: Array<String>) {
    try {
        val num1: Double = MathLib.getNumInput("Enter 1st number: ")
        val op : String? = MathLib.getStringInput("Select operator: + - * /")
        val num2: Double = MathLib.getNumInput("Enter 2nd number: ")

        val res : Double = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2      // Will not cause "Division by Zero" exception with doubles. Results "Infinity"
            else -> throw Exception("Invalid operator")
        }

        println("$num1 $op $num2 = $res")
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


