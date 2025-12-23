fun main() {

    val h = Human()

    println(h.age)
    println(h.age)
    println(h.age)

}

class Human{
    private var accesses = 0
     val age: Int
        get() = ++ accesses
}

//
//class Human {
//    var age = 0
//        get(){
//            return field
//        }
//
//        set(value){
//            field = value
//        }
//}