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
    }
}