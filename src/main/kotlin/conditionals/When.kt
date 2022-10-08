package conditionals
//there is no ternary operator in Kotlin

enum class Scale {
    GOOD, NORMAL, BAD;
}


fun ifFun() {
    val a = 5;
    val b = 7;
    val max = if (a > b) a else b;
}

fun whenAsSwitch(mark: Scale) {
    val result: String = when (mark) {
        Scale.GOOD -> "good";
        Scale.NORMAL -> "normal";
        Scale.BAD -> "bad";
    }

    println(result)
}

fun whenMultiple(mark: Scale) {
    println(
        when (mark) {
            Scale.GOOD, Scale.NORMAL -> "not bad";
            else -> "bad"
        }
    )

}

fun whenCheckClass() {
    val pet: Cat = Cat();

    when (pet) {
        is Cat -> pet.meow();
        is Dog -> pet.bark();
    }
}

// similar to if with 2+ branches
fun whenWithoutAnArgument(degrees : Int){
    val (description, Scale) = when {
        degrees < 5 -> "cold" to Scale.BAD
        degrees < 15 -> "mild" to Scale.NORMAL
        else -> "hot" to Scale.GOOD
    }
}
