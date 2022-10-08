package loops

import conditionals.Cat
import conditionals.Pet

fun forLoop() {
    val list = listOf("a", "b", "c");

    for (s: String in list) {
        println(s);
    }
}



fun forLoopObjects() {
    val a: Cat = Cat();
    val b: Cat = Cat();

    val listOfPets = listOf(a, b);

    for (pet: Pet in listOfPets) {
        //still Cat class, however it is cast to Pet
        println(pet.javaClass)
    }
}

fun forMap() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three");

    for ((key, value) in map) {
        println("$key $value");
    }
}

fun forIndex(){
    val list = listOf(1, 2, 3, 4);
     for ((index, value) in list.withIndex()){
         println("$index $value")
     }
}



fun forClass(){
    class A {
        operator fun component1(): Any {
            return this.a;
        }

        operator fun component2(): Any {
            return this.b;
        }

        var a: Int = 1;
        var b: Int = 3;
    }

    val a = A();
    val b = A();

    val list = listOf(a, b);
    for ((x, y) in list){
        println("$a $b");
    }


}