import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name:String, var lives: Int, var level: Int = 1, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist",1)
    private val inventory = ArrayList<Loot>()

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

    fun getLoot(item: Loot)
    {
        inventory.add(item)
        //code to save inventory
    }

    fun dropLoot(item: Loot): Boolean {
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String): Boolean
    {
        println("$name will be dropped.")
        return inventory.removeIf{it.name == name}
    }

    fun showInventory()
    {
        println("$name's Inventory: ")
        for(item in inventory){
            println(item)
        }
        println("=========================")
    }

}