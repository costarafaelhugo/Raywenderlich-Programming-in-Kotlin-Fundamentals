fun main(args: Array<String>) {
verifyAccount()
}

var userName = ""
var password = ""
var email = ""

fun verifyAccount(){
    if(userName.length >= 6 && password.length >= 10 && (email.contains("@") || email.contains("."))){
        println("Its everithing ok, segue o baile.")
    }else if (userName.isEmpty() || email.isEmpty() || userName.isEmpty()){
       println( "Verify a empty field")
    }
    else if (userName.length <6){
        println("Insert a valid name.")
    }else if (password.length <10){
        println("Insert a valid password.")
    }else {
        println("Insert a valid email")
    }
}
