// From https://kotlinlang.org/docs/basic-syntax.html#creating-classes-and-instances
class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2

    override fun toString(): String {
        return "Rectangle(${this.height}, ${this.length})"
    }

    fun fitsInside(other: Rectangle): Boolean {
        return this.height < other.height && this.length < other.length
    }
}