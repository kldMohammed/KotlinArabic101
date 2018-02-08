package function

fun main(args: Array<String>) {
    val result = add(2, 3)
    display("$result")
}

fun add(x: Int, y: Int) = x + y
fun display(message: String) = println(message)


//you can write the above function instead of
/*
* fun add(x:String , y:String){
* return x+y
* }
* */

