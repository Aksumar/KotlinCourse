package conditionals

open class Pet() {
    protected val field: String = ""
}

open class Cat : Pet() {
    fun meow() {
        println("meow");
    }
}

open class Dog : Pet() {
    fun bark() {
        println("woof");
    }
}