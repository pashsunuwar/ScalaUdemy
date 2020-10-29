package lectures.part2OOP

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "Wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {3
      eat
      println("crunch crunch")
    }
  }

  val Cat = new Cat
  Cat.crunch

  //Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)

  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)


  //overriding
  class Dog extends Animal {
//
    override def eat = {
      super.eat
      println("crunch, nomnomnom")
    }
  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  // polymorphism
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  // super



}
