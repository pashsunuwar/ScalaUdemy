package lectures.part2OOP

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

//constructor
class Person(name: String, val age: Int){
  //body (includes val and var definitions, expressions, function definitons (methods)...)
  val x = 2
  println(1+3)
  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //Overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

}
//class parameters are NOT FIELDS.
//Convert parameter to fields by adding key work val or var to the class parameter
