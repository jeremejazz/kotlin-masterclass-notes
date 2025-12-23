
fun main(){

val p = Person("test")
}


private class Person(val name: String){

    fun getName(){
        println(name)
    }

    private fun getNickname(){
        println("nickname")
    }
}