fun main() {

    val rect1=Rectangle(10.0, 20.0)
    val rect2=Rectangle(15.0, 30.0)

    println("$rect1")
    println("$rect2")
    println(rect1.fitsInside(rect2))
    println(rect2.fitsInside(rect1))
    println()

    val arena = Arena("Bwah", 10, 20)
    val player1 = Player(arena, "Isonity")
    val player2 = Player(arena, "Fractlpaca")

    arena.printPlayers()
    println()

    player1.move(5,500)
    player2.move(2,3)
    arena.printPlayers()
}