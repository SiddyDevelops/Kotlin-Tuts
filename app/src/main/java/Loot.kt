enum class lootType {
    POTION, RING, ARMOR
}

class Loot(val name: String, val lootType: lootType, val value: Double) {
    override fun toString(): String {
        return "$name is $lootType and is worth $value"
    }
}
