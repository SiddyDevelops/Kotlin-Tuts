import android.os.Build
import androidx.annotation.RequiresApi

// This the Main function
@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

//////    println("This is my first kotlin code.")
//////    println("I am Siddharth Singh")
//////
//////    val siddy: String = "Siddharth Singh"
//////    println(siddy)
//////    // Difference between Val and Var -->
//////    //          val is immutable whereas var can be modified (val is static)
//////
//////    println()
//////    val x: Int = 16
//////    val y: Double = 18.0
//////    var z: Double =  x* y
//////    println(z)
//////
//////    z = y/x
//////    println(z)
//////
//////    println()
//////    // Inline variable interpolation
//////    println("My name is: $siddy, I am $y years old.")
//////    println("18 divided by 2 is: ${y/2}")
//////
//////    println()
//////    val new = "I am new line. Redundant declaration."
//////    println(new)
////
////    // Conditional Statements
//////    val lives = 3
//////    val isGameOver = (lives < 1)             // Store state in value
//////    if(isGameOver) {
//////        println("GAME OVER")
//////    } else {
//////        println("Continue Game")
//////    }
////
//////    println("How old are you? ")
//////    val age = readLine()!!.toInt()
//////    println("You age is $age.")
//////    val message: String = if(age < 18){
//////        "You are too old to drive."
//////    } else if(age > 100) {
//////        "You are too old to live."
//////    } else {
//////        "Congratulations! You can drive and vote."
//////    }
//////    println(message)
////
//////    println("How old are you? ")
//////    val age = readLine()!!.toInt()
//////    println("You age is $age.")
//////    val message: String = when {
//////        age < 18 -> {
//////            "You are too old to drive."
//////        }
//////        age > 100 -> {
//////            "You are too old to live."
//////        }
//////        else -> {
//////            "Congratulations! You can drive and vote."
//////        }
//////    }
//////    println(message)
//
//    val sid = Player("Siddy",3)
//    //sid.show()
//    val l = Player("Lomie",2)
//    l.score = 12
//    //l.show()
////    println(l.weapon.name.toUpperCase())
////    println(l.weapon.damageInflected)
//
//    val axe = Weapon("Axe",12)
//    l.weapon = axe
//    //println(axe.name)
//
//    axe.damageInflected = 20
////    println(axe.damageInflected)
////    println(l.weapon.damageInflected)
//
//    sid.weapon = Weapon("sword",15)
//    //println(sid.weapon.name)
//    l.weapon = sid.weapon
//    l.show()
//
//    sid.weapon = Weapon("Spear",20)
//    //println(sid.weapon.name)
//    sid.show()
//
//    val redPotion = Loot("RedPotion", lootType.POTION, 7.50)
//    sid.getLoot(redPotion)
//    val chestArmor = Loot("+3 Chest Armor", lootType.ARMOR, 80.00)
//    sid.getLoot(chestArmor)
//    sid.showInventory()
//
//    sid.getLoot(Loot("Rings of protection +2", lootType.RING,40.25))
//    sid.getLoot(Loot("Invisiblity potion", lootType.POTION,25.30))
//    sid.showInventory()
//
//    if(sid.dropLoot(redPotion)){
//        sid.showInventory()
//    } else {
//        println("You don't have a ${redPotion.name}")
//    }
//
//    val bluePotion  = Loot("Blue potion", lootType.POTION, 6.00)
//    if(sid.dropLoot(bluePotion)){
//        sid.showInventory()
//    } else {
//        println("You don't have a ${bluePotion.name}")
//    }
//
//    if(sid.dropLoot("Invisiblity potion")){
//        sid.showInventory()
//    } else {
//        println("You don't have a \"Invisiblity potion\"")
//    }
//
////    println(sid)


//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//   val vam = Vampire("Vlad")
//   println(vam)
//   vam.takeDamage(8)
//   println(vam)
//
//    for (i in 1..10) {
//        val dracula = VampireKing("Dracula")
//        println(dracula)
//        while (dracula.lives > 0) {
//            if (dracula.dodges()) {
//                continue
//            }
//            if (dracula.runAway()) {
//                println("Dracula Ran Away!")
//                break
//            } else {
//                dracula.takeDamage(80)
//            }
//        }
//        println("-----------------------------------------")
//    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility",lootType.POTION,4.0))
    conan.getLoot(Loot("Mithril",lootType.ARMOR,183.0))
    conan.getLoot(Loot("Ring of speed",lootType.RING,25.0))
    conan.getLoot(Loot("Red potion",lootType.POTION,2.0))
    conan.getLoot(Loot("Cursed Shield",lootType.ARMOR,-8.0))
    conan.getLoot(Loot("Brass Ring",lootType.RING,1.0))
    conan.getLoot(Loot("Chain mail",lootType.ARMOR,4.0))
    conan.getLoot(Loot("Gold Ring",lootType.RING,12.0))
    conan.getLoot(Loot("Gold Ring",lootType.RING,12.0))
    conan.getLoot(Loot("Gold Ring",lootType.RING,12.0))
    conan.getLoot(Loot("Health potion",lootType.POTION,3.0))
    conan.getLoot(Loot("Silver Ring",lootType.RING,6.0))
    conan.getLoot(Loot("Silver Ring",lootType.RING,6.0))

    conan.dropLoot("Gold Ring")
    conan.dropLoot("Gold Ring")
    conan.dropLoot("Silver Ring")
    conan.showInventory()


}
