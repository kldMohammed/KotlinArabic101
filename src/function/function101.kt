package function


fun main(args: Array<String>) {
    greet(englishGreeting())
    greet(arabicGreeting())
}

fun greet(msg: String) {
    println(msg)
}

fun englishGreeting(): String = "Hello "


fun arabicGreeting(): String {
    return "السلام عليكم و رحمة الله تعالي و بركاته"
}


