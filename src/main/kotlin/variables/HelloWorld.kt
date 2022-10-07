package variables

fun helloWorld(){
    println("Enter your name, please : ...")
    // val - for final variables
    // var - for modified variables
    val name:String = readln();
    // we may not to write type of variable result as it is obvious to compiler from context;
    val result:String = "Hello world from $name :)!";
    println(result);

    //val = value = read-only, final
    //var = variable = mutable
}