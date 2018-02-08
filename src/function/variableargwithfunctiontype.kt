package function


fun main(args: Array<String>) {

    names("Khalid", "Mohammed", "Ali", print = { name -> println("$name") })

    //and also you can write in this way
    names("Khalid", "Mohammed", "Ali", print = { println(it) })

    //and also you can write in this way , as i say earlier
    names("Khalid", "Mohammed", "Ali") { println(it) }
}

fun names(vararg names: String, print: (String) -> Unit) {
    for (n in names) {
        print(n)
    }
}