import conditionals.Scale
import conditionals.whenAsSwitch
import conditionals.whenCheckClass
import functions.printSignTimes
import loops.isValidIdentifier
import variables.helloWorld

fun main() {
//helloWorld();

//named and default values
   //   printSignTimes();
   //   printSignTimes("love");
   //   printSignTimes(time = 10);
   //   printSignTimes(time = 10, sign = "^");

//when
   //whenAsSwitch(Scale.GOOD);
   //whenCheckClass();

//loops
   //loops.forLoop();
   //loops.forLoopObjects();
   //loops.forMap();
   //loops.forIndex();
   //loops.forClass();

   println(isValidIdentifier("name"))   // true
   println(isValidIdentifier("_name"))  // true
   println(isValidIdentifier("_12"))    // true
   println(isValidIdentifier(""))       // false
   println(isValidIdentifier("012"))    // false
   println(isValidIdentifier("no$"))    // false
}