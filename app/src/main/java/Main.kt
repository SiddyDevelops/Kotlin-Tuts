// This the Main function
fun main(args: Array<String>) {

//    println("This is my first kotlin code.")
//    println("I am Siddharth Singh")
//
//    val siddy: String = "Siddharth Singh"
//    println(siddy)
//    // Difference between Val and Var -->
//    //          val is immutable whereas var can be modified (val is static)
//
//    println()
//    val x: Int = 16
//    val y: Double = 18.0
//    var z: Double =  x* y
//    println(z)
//
//    z = y/x
//    println(z)
//
//    println()
//    // Inline variable interpolation
//    println("My name is: $siddy, I am $y years old.")
//    println("18 divided by 2 is: ${y/2}")
//
//    println()
//    val new = "I am new line. Redundant declaration."
//    println(new)

    // Conditional Statements
//    val lives = 3
//    val isGameOver = (lives < 1)             // Store state in value
//    if(isGameOver) {
//        println("GAME OVER")
//    } else {
//        println("Continue Game")
//    }

//    println("How old are you? ")
//    val age = readLine()!!.toInt()
//    println("You age is $age.")
//    val message: String = if(age < 18){
//        "You are too old to drive."
//    } else if(age > 100) {
//        "You are too old to live."
//    } else {
//        "Congratulations! You can drive and vote."
//    }
//    println(message)

//    println("How old are you? ")
//    val age = readLine()!!.toInt()
//    println("You age is $age.")
//    val message: String = when {
//        age < 18 -> {
//            "You are too old to drive."
//        }
//        age > 100 -> {
//            "You are too old to live."
//        }
//        else -> {
//            "Congratulations! You can drive and vote."
//        }
//    }
//    println(message)

    val sid = Player("Siddy",3)
//    println(sid.name)
//    println(sid.lives)
//    println(sid.level)
//    println(sid.score)
    sid.show()
    val l = Player("Lomie",2)
    l.score = 12
    l.show()
}
