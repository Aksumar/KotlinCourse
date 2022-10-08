package conditionals

open class Pet {
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