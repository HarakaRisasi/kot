fun main() {
    customPrintln("Hello@")
    
    happyBirthday(32)
    
    funRepeat(20)
    
    funWhile(5)
}

fun customPrintln(kotlin: String){
    println(kotlin)
}

fun happyBirthday(age: Int){
    println("... are you ${age}?")
}

fun funRepeat(num: Int){
    repeat(num){
        happyBirthday(32)}
}

fun funWhile(num: Int){
    var index: Int = 0
    
    while(index < num){
        println(index)
        index++
    }
    
}
