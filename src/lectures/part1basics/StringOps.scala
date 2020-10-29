package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2)) //l
  println(str.substring(7, 11)) // I am
  println(str.split(" ").toList) //List(Hello,, I, am, learning, Scala)
  println(str.startsWith("Hello")) //true
  println(str.replace(" ", "-")) //Hello,-I-am-learning-Scala
  println(str.toLowerCase()) //hello, i am learning scala
  println(str.length) //26

  val aNumberString = "2"
  val aNumber = aNumberString.toInt //2
  println("a" +: aNumberString :+ 'z') //a2z //prepending and appending are scala specific
  println(str.reverse) //scala specific //alacS gninrael ma I ,olleH
  println(str.take(2)) //He


  // Scala-specific: String interpolator

  // s-interpolator
  val name = "Pash"
  val age = 11
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} next month"
  println(anotherGreeting) //Hello, my name is Pash and I will be turning 12 next month

  // f-interpolator

  val speed = 1.2f
  val myth = f"$name%s m  can eat $speed%2.2f burgers per minute" //Pash can eat 1.20 burgers per minute
  println(myth)

  // raw-interpolator

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")



}
