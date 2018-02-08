package variablesAndTypes

fun main(args: Array<String>) {
    //the compile will infer type from the assigned value no need to write String
    val name = "Khalid"

    val age = 25

    val isAProgrammer = true

    //but if you want to assign value latter you should explicitly write data type
    val myFavNumber: Int

    myFavNumber = 16
}