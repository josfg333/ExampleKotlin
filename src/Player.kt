class Player(val arena: Arena, val name: String) {
    init {
        arena.addPlayer(this)
    }
    var row:Int=0
    var col:Int=0

    override fun toString(): String{
        return "Player $name @ ($row, $col) in $arena"
    }

    fun move(deltaRow: Int, deltaCol: Int) {
        row += deltaRow;
        col += deltaCol;
        if (row<0) row=0
        if (row>=arena.height) row = arena.height-1
        if (col<0) col=0
        if (col>=arena.width) col = arena.width-1
    }
}