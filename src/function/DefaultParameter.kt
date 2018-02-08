package function

fun main(args: Array<String>) {
    showMessage()
    showMessage("Good morning")
}

/**
 * @param msg the message to be displayed
 *
 * if i call this function with a param it will display message sent to it
 * else it will display hello world
 * */
fun showMessage(msg: String = "Hello World") {
    println("$msg")
}