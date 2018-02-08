package dealingwithnull


fun main(args: Array<String>) {
    //declare a not null variable
    val name: String = "Khalid"
    print("$name")

    //to declare a nullable variable
    val firstName: String? = "Khalid"

    //if you try to assign a not null variable to a nullable variable
    // like this is work fine

    val number: Int = 5

    val nullableNumber: Int?

    nullableNumber = number

    println(nullableNumber)
}