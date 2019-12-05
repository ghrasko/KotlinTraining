import kotlin.NumberFormatException
import Operation.*

fun main(args: Array<String>) {
    try {
        val num1: Double = MathLib.getNumInput("Enter 1st number: ")
        val num2: Double = MathLib.getNumInput("Enter 2nd number: ")
        val op : String? = MathLib.getStringInput("Select operator: + - * /")

        val res : Double =
            when (op) {
                ADD.operator -> MathLib.addValues(num1, num2)
                SUBTRACT.operator -> MathLib.subtractValues(num1, num2)
                MULTIPLY.operator -> MathLib.multiplyValues(num1, num2)
                DIVIDE.operator -> MathLib.divideValues(num1, num2)
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


