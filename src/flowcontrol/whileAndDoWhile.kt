package flowcontrol

fun main(args: Array<String>) {
    whileLoop()
    doWhile()
}

fun whileLoop() {
    var x = 0
    while (x < 5) {
        println(x)
        x++
    }
}

fun doWhile() {
    var y = 6
    do {
        println(y)
        y++
    } while (y < 10)
}