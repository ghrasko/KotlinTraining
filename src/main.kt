import model.ClothingItem
import model.Person
import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    println(item)

    item.price = 15.99
    println(item)

    val item2 = ClothingItem("M", 14.99)
    println(item2)

    val person = Person("Gábor", "Hraskó")
    println("That person is ${person.fullName}")

    println("item price = ${item2.price}")

    Locale.setDefault(Locale.FRANCE)
    val formatter = NumberFormat.getCurrencyInstance()
    println("item price = ${formatter.format(item2.price)}")

    Locale.setDefault(Locale.CHINA)
    val formatter2 = NumberFormat.getCurrencyInstance()
    println("item price = ${formatter2.format(item2.price)}")

}


