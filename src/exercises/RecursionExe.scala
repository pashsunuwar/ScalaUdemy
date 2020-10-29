package exercises

import scala.annotation.tailrec

object RecursionExe extends App {

  //1. Concatenate a string n times
  @tailrec
  def concatenateTailrec(aString: String, x: Int, accumulator: String): String =
    if (x <= 0)accumulator
    else concatenateTailrec(aString, x-1, aString + accumulator)

  println(concatenateTailrec("Hi There ", 4, ""))


  //2. IsPrime function tail recursive

  def isPrime()
}
