package function


fun main(args: Array<String>) {
    //using named argument but params are in order
    greet(firstName = "Khalid", lastName = "Mohammed")
    //mix order of params
    greet(lastName = "Ahmed", firstName = "Ali")
    //this way without use of named argument you should put params in order
    greet("Afraa", "Ismail")
    //also you can mix between two ways
    //but remember the first on its in order but i call another with a named argument
    greet("Amna", lastName = "Ahmed")
    //the same thing here the first param in order but mix order of remaining params
    call("Khalid", age = 25, location = "Sudan")
}

fun greet(firstName: String, lastName: String) {
    println("Good morning $firstName $lastName")
}

fun call(name: String, location: String, age: Int) {
    println("Call $name who lives at $location and he is $age old")
}