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

  def isPrime(n: Int): Boolean ={
    @tailrec
    def isPrimeTailrec (t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime)false
      else if (t<=1) true
      else isPrimeTailrec(t-1, n%t!=0 && isStillPrime)
      isPrimeTailrec(n/2, true)
    }
  println(isPrime(2003))


  //3. Fibonacci

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  println(fibonacci(8)) // 1 1 2 3 5 8 13 21
}
