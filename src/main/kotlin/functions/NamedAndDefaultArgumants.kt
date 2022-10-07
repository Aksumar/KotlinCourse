package functions

//void function (returns Unit)
@JvmOverloads
fun printSignTimes(sign: String = "*", time: Int = 5){
    println(sign.repeat(time));
}