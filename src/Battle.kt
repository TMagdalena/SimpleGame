class Battle {

    var move = 0
    val movesMap:MutableMap<Int,String> = mutableMapOf()

    fun attack (opponent1: Character, opponent2: Character ) {
        while (opponent1.health != 0 && opponent2.health != 0) {
            opponent1.health -= opponent2.strength * 10
            opponent2.health -= opponent1.strength * 10
            move++
            movesMap.put(move, "${opponent1.health} ${opponent2.health}")

            if (opponent1.health <= 0) {
                opponent1.isDefeated = true
                println("${opponent1.name} defeated")
                return
            }

            if (opponent2.health <= 0) {
                opponent2.isDefeated = true
                println("${opponent2.name} defeated")
                return
            }
        }
    }
}