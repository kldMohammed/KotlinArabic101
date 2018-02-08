package function


/*the int type has no method to show the number
* here i add function to this class
* this represent to instance */


fun Int.show() {
    println("this number is $this")
}


fun String.greet() {
    println("hello $this")
}

fun String.lastElement(): Int {
    return (length - 1)
}

fun main(args: Array<String>) {
    "Khalid".greet() // print hello hello khalid
    val last = "Khalid".lastElement()
    println(last)
    5.show()


}


