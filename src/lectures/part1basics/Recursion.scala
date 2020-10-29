package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial (n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Completed factorial of " + n)

      result
    }
    println(factorial(10))

  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /* anotherFactorial(10) = factHelper(10, 1)
     = factHelper(9, 10 * 1)
     = factHelper(8, 9 * 10 * 1)
     = factHelper(7, 8 * 9 * 10 * 1)
     = ...
     = factHelper(2, 3 * 4 * ... * 10 * 1)
     = factHelper(1, 1 * 2 * 3 * ... * 9 * 10)
     = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
   */

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION
}
