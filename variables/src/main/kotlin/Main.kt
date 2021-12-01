/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can also reference parameters, like the [arguments].
 * @param arguments .
 * @author Hugo Costa.
 * */

fun main(arguments: Array<String>) {
    var myAge: Int = 34
    val name: String = "Hugo"
    val lastName = "Costa"
    val weight = " 88.7"

    println(name)

    println("I am $myAge years old.")

    myAge+=1

    println("I am $myAge years old.")

    println("My name is $name $lastName, i am $myAge years old, and my weigth is $weight kg.")

    val fullName = "$lastName, $name"
    println(fullName)

    val ageAsString = myAge.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

//This is a line coment

    /*
    * This is a multiline comment.
    * You don't have to add // berfore each line
    *
    * */
}