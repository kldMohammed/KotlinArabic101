package function

fun main(args: Array<String>) {
    names("Khalid", "Omer", "Osman", "Amna", "Omnia")
}

fun names(vararg names: String) {
    for (n in names) {
        println("$n")
    }
}