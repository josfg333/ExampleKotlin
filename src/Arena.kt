public class Arena (val name: String, val height: Int, val width: Int){
    val playerList = mutableListOf<Player>()

    public fun addPlayer(player: Player) {
        this.playerList.add(player)
    }

    override fun toString(): String {
        return "Arena $name"
    }

    public fun printPlayers() {
        for (player in playerList) {
            println(player)
        }
    }
}
