fun main() {

//    val elements = listOf("a", "b")
//
//
//    for(e in elements){
//        println(e)
//    }

//    val range1 = 1..10
//    val range2 = 0 until 10
//    val letters = 'a' .. 'z'
//
//    println(range1)
//    println(range2)
//
//    repeat(3){
//        println("Hello")
//    }
    println("Check: ${'o' in "Pedro"}")
    println("z is digit: ${isDigit('z')}")
    println("z is not digit: ${isNotDigit('z')}")
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'