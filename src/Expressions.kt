fun main() {

    val number = 10
    println(setAge(17))

    val about = "Lorem ipsum dolor sit amet\n" +
            " consectetur adipiscing elit, monoad a sad a a a"

    val about1 = """
        #Lorem ipsum
        #adal asd ads  a 
    """.trimMargin(marginPrefix = "#")

    println(about1)

}


fun setAge(age: Int): String{
    return "Person is ${if (age < 18) "Minor" else "Adult"}"

}