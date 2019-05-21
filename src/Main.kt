
val names = listOf("Ark", "Samin")
val weapons = mapOf(1 to Weapon("Pistol", 2), 2 to Weapon("Shotgun", 3), 3 to Weapon("Knife", 1))

fun main() {

    println("Starting new game...")
    var playerOne = Player(null)
    val enemy = Enemy()

    println("Choose your character's name:")
    var input = readLine()
    val playerName = if (input != null && input.isNotBlank()) input else {println("Invalid input. Random name generated."); names[0]}
    playerOne.name = playerName

    println("Name your enemy:")
    input = readLine()
    val enemyName = if (input != null && input.isNotBlank()) input else {println("Invalid input. Random name generated."); names[1]}
    enemy.name = enemyName

    println("Choose difficulty (1 -> LOW, 2 -> MEDIUM or 3 -> HIGH):")
    input = readLine()
    val level = if(input != null && input.isNotBlank()) input.toInt() else {println("Invalid input. Default difficulty 1 set."); 1}
    enemy.adjustDifficulty(level)

    println("Choose your weapon (1-3):")
    input = readLine()
    val weaponNumber = if(input != null && input.isNotBlank()) input.toInt() else {println("Invalid input. No weapons selected."); null }
    playerOne.addWeapon(weaponNumber)

    println("Player one: ${playerOne.name} H:${playerOne.health} S:${playerOne.strength}")
    println("Enemy: ${enemy.name} H:${enemy.health} S:${enemy.strength}")

    println("Press enter for battle.")
    readLine()

    val battle = Battle()
    battle.attack(playerOne, enemy)

    val numberOfMoves = battle.movesMap.mapValues { it.value }
        .size

    println("Battle ended after $numberOfMoves moves.")
}