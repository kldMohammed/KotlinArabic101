package flowcontrol

fun main(args: Array<String>) {
    val total = 10

    if (total > 5) {
        println("$total is greater than 5")
    } else if (total > 10) {
        println("$total is greater than 10")
    } else {
        println("$total is less than 6")
    }
}