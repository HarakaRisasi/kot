fun main() {
    val myOwnDice = Dice(6)
    println(myOwnDice.sides)
    myOwnDice.roll()
}

class Dice(val numSides: Int) {
    var sides = numSides

    fun roll() {
        val randomNumber = (1..sides).random()
        println(randomNumber)
    }

}