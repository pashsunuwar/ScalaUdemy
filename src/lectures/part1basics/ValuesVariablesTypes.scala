package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  val aString: String = "hello";
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4612
  val aLong: Long = 452133132136466L
  val aFloat: Float = 2.4f
  val aDouble: Double = 3.14


  //variables

  var aVariable: Int = 4

  aVariable = 5 // side effects are useful cus they allow us to see what our programs are doing

}
