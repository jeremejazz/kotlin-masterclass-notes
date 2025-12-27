fun main() {
    val people = listOf<Person12>(
        Person12(name = "Pedro", age = 25, male = true),
        Person12(name = "Petra", age = 25, male = false),
        Person12(name = "Jaime", age = 30, male = true),
        Person12(name = "Jamie", age = 28, male = false),
        Person12(name = "Perlita", age = 21, male = false)
    )


    println(people.any(Person12::important))

}

data class Person12(
    val name: String,
    val age: Int,
    val male: Boolean
)

fun Person12.important() = this.name.startsWith(prefix = "J") && this.age > 25


