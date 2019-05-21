class Enemy : Character {
    override var strength: Int = 1
    override var health: Int = 100
    override var isDefeated: Boolean = false
    override var name: String = ""

    fun adjustDifficulty(difficulty: Int) {
        strength += difficulty
    }

}