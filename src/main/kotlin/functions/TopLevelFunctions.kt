//We can change the name of this JVM class by annotation
@file:JvmName("Utils")
package functions

//simple funktion aka java-style
fun max(a: Int, b: Int): Int {
    if (a > b)
        return a;
    return b;
}

//inline function
//we can omit return type if it is clear to compiler & users
fun max2(a: Int, b: Int) = if (a > b) a else b;

//we can define function inside other function
fun doubleMin(a: Int, b: Int): Int {
    fun min(a: Int, b: Int) = if (a < b) a else b;

    return min(a, b) * 2;
}