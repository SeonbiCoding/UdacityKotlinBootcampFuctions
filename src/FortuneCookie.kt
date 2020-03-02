fun main(args: Array<String>) {

    // for statement 활용
    for (i in 1..10) {
        var fortune = getFortuneCookie()
        print("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
        println()
    }

    // do .. while statement 활용
    do {
        var fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        println()
    } while (fortune != "Take it easy and enjoy life!")
}

fun getFortuneCookie() : String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")

    var birthday = readLine()?.toIntOrNull() ?:1

    return fortunes[birthday.rem(fortunes.size)]
}
