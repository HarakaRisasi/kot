fun main() {
    println(checkPalindrome("aabaa"))
    println(checkPalindrome("zzzazzazz"))
    println(checkPalindrome("h"))
}

fun checkPalindrome(inputString: String): Boolean = inputString.reversed() == inputString
