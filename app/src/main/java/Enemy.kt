open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    fun takeDamage(damage:Int)
    {
        val remainingHitpoints = hitPoints - damage
        if(remainingHitpoints > 0){
            hitPoints = remainingHitpoints
            println("$name took $damage points of damage, and has $hitPoints left.")
        } else {
            lives -= 1
            if(lives > 0) {
                println("$name lost a life.")
            } else {
                println("No lives left, $name is dead.")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }

}