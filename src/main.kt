fun main(args: Array<String>) {
    var aString = "Hello!"      // char sequence = string

    println(aString)

    val empty = String()
    println("\"$empty\"")

    val cArr:CharArray = aString.toCharArray()      // char array
    println(cArr.toList())
    println(aString.toList())

    val bArr:ByteArray = aString.toByteArray()
    println(bArr.toList())

    aString += " And Welcome!"
    println(aString)

    val len = aString.length
    for (i:Int in 0 until len) {
//        val c:Char = aString[i]
        val c:Char = aString.get(i)
        println(c)
    }
}

