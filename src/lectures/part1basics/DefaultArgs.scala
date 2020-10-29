package lectures.part1basics

object DefaultArgs extends App {

 def trFact(n: Int, acc: Int = 1): Int =
   if (n <= 1) acc
   else trFact(n-1, n*acc)

 val fact10 = trFact(10, 2)


  def savePicture(format: String= "jpg", width: Int=1920, heigth: Int= 1080): Unit = println("saving picture")
  savePicture(width = 600)

  /*
  1. pass in every leading argument
  2. name the arguments
   */

  savePicture(heigth = 600, width = 400, format = "bmp")

}