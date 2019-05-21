class Player(var weapon: Weapon?
) : Character {
    override var strength: Int = 1
    override var health: Int = 100
    override var isDefeated: Boolean = false
    override var name: String = ""

    fun addWeapon(weaponNumber: Int?) {
        weapon = weapons[weaponNumber]
        if (weapon != null) {
            strength += weapon!!.strengthOfWeapon
        }
    }
}