// This the Main function
fun main(args: Array<String>) {
    println("This is my first kotlin code.")
    println("I am Siddharth Singh")

    val siddy: String = "Siddharth Singh"
    println(siddy)
    // Difference between Val and Var -->
    //          val is immutable whereas var can be modified (val is static)

    println()
    val x: Int = 16
    val y: Double = 18.0
    var z: Double =  x* y
    println(z)

    z = y/x
    println(z)

    println()
    // Inline variable interpolation
    println("My name is: $siddy, I am $y years old.")
    println("18 divided by 2 is: ${y/2}")

}
