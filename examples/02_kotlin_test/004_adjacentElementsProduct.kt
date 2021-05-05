fun main() {
    println(adjacentElementsProduct(mutableListOf(3, 6, -2, -5, 7, 3)))
}
    
fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var num2: Int = inputArray[1]
    var max: Int = inputArray[0] * inputArray[1]
    
    for(num1 in inputArray){
        if(num1 * num2 > max)max = num1 * num2
        num2 = num1
    }
    
    return max
}