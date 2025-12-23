fun main() {

    val animals = mapOf(
        "monkey" to "brown",
        "tiger" to "orange",
        "whale" to "blue"
    )

    println(animals["monkey"])
    print(animals.keys)
    animals.forEach { (key, value) ->
        println("$key:$value")
    }

    val animalList = listOf("monkey", "tiger", "whale")


    println(animalList.associateBy { it })


    val animalList2 = listOf(Animal("monkey", 2), Animal("tiger", 4), Animal(name="whale", 10))
    val animalMap = animalList2.associateBy ( {it.name}, {it.age} )
    animalMap.keys
    println(animalMap)
}

class Animal(
    val name: String,
    val age: Int
)