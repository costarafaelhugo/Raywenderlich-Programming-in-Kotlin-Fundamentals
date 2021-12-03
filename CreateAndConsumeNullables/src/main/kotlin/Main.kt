fun main(args: Array<String>) {
    val name = "Hugo"
    val nickName: String? = "Cabeça"
    val lastName: String? = null

    println(nickName)

    val nickNameLenght = nickName?.length?.toDouble()
    println(nickNameLenght)

    if (lastName != null) {
        println("My last name is $lastName")
    } else {
        println("I do not have a last name")
    }

    if (nickName?.isEmpty() == true) {
        println("You do not have a nickname! It is length is ${nickName.length}")
    }

    val notNullNickname = requireNotNull(nickName)
    println(notNullNickname.length)

    val myNickName = nickName ?: name
    println(myNickName)

    val lastBirthdayYear = 2021
    var myAge = 34

    val myAgeNotNull = myAge ?: return

    val yearOfBirth = lastBirthdayYear - myAgeNotNull
    println("I was born in $yearOfBirth.")
    message()
}


//Challenge

val myPassword = "12345"
val passwordLength = myPassword?.length ?: 0

fun message() {

    val messagem = if (passwordLength == 0) {
        "Ehm, you need a password to keep safe!"
    } else if (passwordLength > 0 && passwordLength < 6) {
        "Weak password! Try adding a few more symbols to it!"
    } else if (passwordLength > 10) {
        "No one is getting through this"
    } else {
        "Ironclad"
    }
    println(messagem)
}