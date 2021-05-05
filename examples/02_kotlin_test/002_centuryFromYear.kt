fun main() {
    println(centuryFromYear(1905))
}

fun centuryFromYear(year: Int): Int {
    return (year - 1) / 100 + 1
}