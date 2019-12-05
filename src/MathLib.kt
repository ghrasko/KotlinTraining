import java.math.BigDecimal

class MathLib {

    var runningTotal = 0.0.toBigDecimal()

    fun addValue(value: Double) {
        runningTotal += value.toBigDecimal()
    }

    companion object {
        fun getNumInput(prompt : String): Double {
            println(prompt)
            return readLine()!!.toDouble()
        }

        fun getStringInput(prompt : String): String? {
            println(prompt)
            return readLine()
        }

        fun addValues(num1: Double, num2: Double) = num1 + num2
        fun subtractValues(num1: Double, num2: Double) = num1 - num2
        fun multiplyValues(num1: Double, num2: Double) = num1 * num2
        // Divide by zero not cause "Division by Zero" exception with doubles. Results "Infinity"
        fun divideValues(num1: Double, num2: Double) = num1 / num2
    }
}