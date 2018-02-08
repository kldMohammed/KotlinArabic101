package flowcontrol

fun main(args: Array<String>) {
    val age = 1
    when (age) {
        1 -> println("its one ")
        2 -> println("its two ")
        else -> print("Wrong number")
    }


    val number = 5
    when (number) {
        in 0..5 -> println("in 0 to 5")
        in 5..10 -> println("from 5 to 10")
        else -> println("out of range")
    }
}