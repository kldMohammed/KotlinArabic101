package function

fun main(args: Array<String>) {
    names("Khalid", "Omer", "Osman", age = 20)
}

fun names(vararg names: String, age: Int) {
    for (n in names) {
        println("$n is $age old")
    }
}