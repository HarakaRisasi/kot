fun main() {
    val age = 18
    val layers = 5

    candles(age)
    bottom(age, "&")
    cake(age, layers)
}

fun candles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()

    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

fun bottom(num: Int, typeDash: String) {
    repeat(num + 2) {
        print(typeDash)
    }
    println()
}

fun cake(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

