import kotlin.random.Random

fun main() {

//    print("Enter number: ")
//    val number:Int = readln().toInt()

//    val result = when(number){
//        1-> {
//            1
//        }
//        2->{
//            2
//        }
//        else -> {
//            null
//        }
//    }

    when (getPerson()){
        is Person2.Male -> {
            println("Male")
        }
        is Person2.Female -> {
            println("Female")
        }
    }

    println(Priority.LOW)

}

fun getPerson(): Person2{
    return if (Random.nextInt(from = 1, until = 3) == 1) Person2.Male else Person2.Female
}

sealed class Person2{
    object Male: Person2()
    object Female: Person2()

}


enum class Priority{
    LOW, MEDIUM, HIGH
}