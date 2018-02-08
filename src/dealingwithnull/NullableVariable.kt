package dealingwithnull

fun main(args: Array<String>) {

    //declare a notnull variable
    var firstName: String? = "Khalid"

    //try to assign its value to a notnull variable like this
    //un comment it to see error
    //var name: String = firstName

    //to solve the error the compiler that
    //told you that  this variable is a notnull and you try to assign a nullable variable
    // you can do this ``!!`` this will force the compiler to skip check nullity
    var name: String = firstName!!

    //if i want to get the length of the firstName variable
    //i knew it can be null and it will threw NullPointerException if i do something like this

    //it will threw exception
    // println(firstName.length)

    //but how i can deal with it , hmmm there sound in my mind told me you
    //should check if its null or not like this
    if (firstName != null) {
        println(firstName.length)
    }

    // there a way more concise like the kotlin feature say its concise
    //like this ```firstName?.length``` it will work pretty

    print(firstName.length)


}