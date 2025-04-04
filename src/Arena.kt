class Arena (private val name: String, val height: Int, val width: Int){
    // Contains players in the arena
    private val playerList = mutableListOf<Player>()

    fun addPlayer(player: Player) {
        this.playerList.add(player)
    }

    override fun toString(): String {
        return "Arena $name"
    }

    fun printPlayers() {
        for (player in playerList) {
            println(player)
        }
    }

}
