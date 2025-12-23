fun main() {
    val contact1 = Contact("Jeje1")
    val contact2 = contact1.copy()

    contact1.number = 1
    contact2.number = 2
//    println(contact1 == contact2)
    println(contact2 == contact1)
    val (name) = contact1

    println(name)

}

data class Contact(
    var name: String,

    ){
    var number = 2
}