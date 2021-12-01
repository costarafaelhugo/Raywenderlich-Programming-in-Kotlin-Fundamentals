fun main(args: Array<String>) {
    val isProgrammingAwesome = true

    println("Is programming awesome? $isProgrammingAwesome")

    var myAge = 34

    val isLegalDrivinAge = myAge >= 18
    println(isLegalDrivinAge)

    val ageTim = 37
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val yearOfBirth = 1987

    val isBornInTwentiethCentury = yearOfBirth < 2000
    println(isBornInTwentiethCentury)

    val strangerName = "Tim"
    val myName = "Hugo"

    val isSameName = strangerName == myName
    println(isSameName)

    val areNamesDifferent = myName != strangerName
    println(areNamesDifferent)

    println(!areNamesDifferent)

    val firstObject = Any()
    val secondObject = Any()

    println(firstObject===secondObject)
    println(firstObject!==secondObject)

    val isNameEmpty = myName.isEmpty()
    println(isNameEmpty)
}