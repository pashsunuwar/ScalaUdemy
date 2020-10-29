package lectures.part1basics

object Expressions extends App {
  val x = 1+2
  println(x)

  println(2+3*4)
  //+ - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= < <=0

  println(!(1 == x))
  // ! & ||

  var aVariable = 2
  aVariable += 3 //also works with -= *= /= ......these are all side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = false
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition)5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN.. will learn a better way to iterate in Scala later on!

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    println(if (z < 2) "hello" else "goodbye")
  }


}
