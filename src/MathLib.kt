class MathLib {
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