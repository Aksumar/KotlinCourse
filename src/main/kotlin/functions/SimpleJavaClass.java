package functions;

import static functions.NamedAndDefaultArgumantsKt.printSignTimes;
import static functions.Utils.doubleMin;

public class SimpleJavaClass {

    //Top level functions from Kotlin file can be used in java as static methods
    public static void function(){
        System.out.println(doubleMin(1 ,2));
    }

    public static void namedAndDefaultArgs(){
        printSignTimes("*", 5);
        // with annotation JvmOverloads on kotlin function
        printSignTimes();
        printSignTimes("*");
    }
}
