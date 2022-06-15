class Player(val id: Int, val name: String) {
    companion object {
        var role = "playable character"
    }

    fun getInfo() = "$id, $name, $role"
}

fun getPlayerInfo(player: Player) = player.getInfo()

//fun main() {
//    val player = Player(1, "bob")
//
//    getPlayerInfo(player)
//}