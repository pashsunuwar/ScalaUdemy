package exercises

object OOBasicsExe  extends App {
  val author = new Writer("Charles", "Dickens", 1812)
  val Novel = new Novel("Great Expectations", 1861, author)

  println(Novel.authorAge)
  println(Novel.isWrittenBy(author))
  author.fullName()

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Writer(firstname: String, surname: String, val DOB: Int) {
  //method full name
  def fullName(): Unit = println(firstname + " " + surname)
}

class Novel(name: String, year: Int, author: Writer) {
  //methods authorAge, isWritten by, copy(new year of release) - new instance of Novel
  def authorAge = year - author.DOB
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0){
  //method current count
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  def inc(n: Int): Counter = {
    if (n<=0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter =
    if (n<=0) this
    else dec.dec(n-1)

  def print = println(count)
}