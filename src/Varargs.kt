

fun main(){

    println(sum())
    val p = intArrayOf(4,1,3,5,1)
    println(sum(*p))
}


fun sum(vararg numbers: Int): Int{

    var total = 0;

    for(m in numbers){
        total += m
    }

    return total
}