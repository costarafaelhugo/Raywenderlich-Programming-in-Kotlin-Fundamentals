fun main(args: Array<String>) {
    checkPasswordSecurit()
    checkNames()
}


fun checkPasswordSecurit() {
    var password = "12364789"
    if (password.length >= 10) {
        println("Is Secure.")
    } else {
        println("Is not Secure")
    }
}

fun checkNames(){
    val nameOne = "Robsu"
    val nameTwo = "Robsu"

    if(nameOne.equals(nameTwo)){
        println("Is equal")
    }else{
        println("Is not equal")
    }
}


