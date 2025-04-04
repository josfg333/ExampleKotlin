class Player(val arena: Arena, val name: String) {
    init {
        // Add player to its parent arena
        arena.addPlayer(this)
    }

    // Start at (0,0)
    var row:Int=0
    var col:Int=0

    override fun toString(): String{
        return "Player $name @ ($row, $col) in $arena"
    }

    fun move(deltaRow: Int, deltaCol: Int) {
        row += deltaRow
        col += deltaCol

        // If out of bounds of arena, bring back within bounds
        if (row<0) row=0
        if (row>=arena.height) row = arena.height-1
        if (col<0) col=0
        if (col>=arena.width) col = arena.width-1
    }
}