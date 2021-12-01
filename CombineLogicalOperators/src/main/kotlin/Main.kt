fun main(args: Array<String>) {
    val myAge = 34
    val country = "Brasil"

    val isLegalDrivinAge: Boolean = (myAge >= 18 && country == "Brasil") || (country == "USA" && myAge >= 16)
    println(isLegalDrivinAge)

    if (isLegalDrivinAge){
        println("You can drive")
    }else{
        println("Esquece isso ai.")
    }

    if (myAge >=18) println("I am an adult") else println("I am a baby")
}