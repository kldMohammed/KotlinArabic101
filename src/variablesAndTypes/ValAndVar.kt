package variablesAndTypes

fun main(args: Array<String>) {
    //this is mutable variable ,
    // its value can be changed during the program
    var mutableVariable: Int = 1
    println(mutableVariable)
    //its value can be changed and re assigned
    //like this
    mutableVariable = 2
    println(mutableVariable)


    //Immutable variable , its value can never be changed after first assignment
    //only declare the variable
    val immutableVariable: Int

    //here is the first assign
    immutableVariable = 5

    //after first assignment its value never changed
    //and if you try to changed the compiler will threw an error
    //try to uncomment the below line and try it to see the error and the error message is val cannot be re-assigned
    // immutableVariable = 6


}