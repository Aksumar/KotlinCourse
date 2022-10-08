package loops

fun range() {
    for (i in 1 until 9) {
        println(i)
    }

    for (i in 1..9) {
        println(i)
    }
}

fun isNotDigit(c: Char) = c !in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty())
        return false;

    val first = s[0];

    val firstResult = when (first) {
        in 'a'..'z', in 'A'..'Z', '_' -> true
        else -> false
    }

    var result = true;
    for (letter in s){
         when(letter){
            in 'a'..'z',
            in 'A'..'Z',
            '_', in '0'..'9' -> result = true;
            else -> result = false;
        }
    }

    return firstResult && result;
}