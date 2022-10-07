import functions.printSignTimes
import variables.helloWorld

fun main() {
   //helloWorld();

   //named and default values
   printSignTimes();
   printSignTimes("love");
   printSignTimes(time = 10);
   printSignTimes(time = 10, sign = "^");


}