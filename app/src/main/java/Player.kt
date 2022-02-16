class Player(val name:String, var lives: Int , var level: Int = 1, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist",1)
    val inventory = ArrayList<Loot>()

    fun show()
    {
        if(lives > 0) {
            println("$name is alive.")
        } else {
          println("$name is dead.")
        }
    }

    override fun toString(): String {
        return("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon}
        """)
    }

    fun showInventory()
    {
        println("$name's Inventory: ")
        println(inventory.get(0))
        println("=========================")
    }

}