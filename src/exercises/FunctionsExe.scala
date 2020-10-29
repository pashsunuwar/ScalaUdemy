package exercises

object FunctionsExe extends App {
  /*
1. A greeting function (name, age)

2. Factorial function 1 * 2 * 3 * ... * n

3. A Fibonacci function
   f(1) = 1
   f(2) = 1
   f(n) = f(n-1) + f(n-2)

4. Tests if a number is prime
 */

  //1.
  def greetingFunction(name: String, age: Int): String = {
  "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetingFunction("Bob", 85))

  //2.
  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else  n * factorialFunction(n-1)
  }
  println(factorialFunction(5))

  //3.
  def fibonacci(n: Int) : Int = {
  if (n <= 2) 1
  else fibonacci(n-1) + fibonacci(n-2)
  }
  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  //4.
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(4))
}
