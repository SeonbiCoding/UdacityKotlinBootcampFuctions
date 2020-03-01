fun main(args: Array<String>) {
    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

    if (args[0].toInt() < 12) println("Good morning, Kotlin")
    else println("Good night, Kotlin" )
}