fun main() {

    val rect1=Rectangle(10.0, 20.0);
    val rect2=Rectangle(15.0, 30.0);

    println("${rect1}");
    println("${rect2}")
    println(rect1.fitsInside(rect2));
    println(rect2.fitsInside(rect1));
}