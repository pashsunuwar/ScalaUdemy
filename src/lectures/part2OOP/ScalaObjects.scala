package lectures.part2OOP

object ScalaObjects extends App {

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def from(mother: Person, father: Person): Person = new Person("Bob")
  }
  class Person(val name: String) {

  }
  // COMPANIONS

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("mary")
  val john = new Person("John")
  println(mary == john) //false

  val bob = Person.from(mary, john)
}
