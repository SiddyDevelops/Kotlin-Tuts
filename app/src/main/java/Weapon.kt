class Weapon(var name: String, var damageInflected: Int) {

    override fun toString(): String {
        return "$name inflicts $damageInflected points of damage."
    }

}