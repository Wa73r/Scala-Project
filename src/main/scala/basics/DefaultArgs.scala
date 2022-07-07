package basics

object DefaultArgs extends App {

  def trFact(x: Int, acc: Int = 1): Int = {
    if(x <= 1) acc
    else trFact(x-1, acc*x)
  }

  //default args
  println(trFact(5))

  def imageDisplay(ext : String, height: Int, width: Int): Unit = print(ext+height+width)

 //named args
 imageDisplay(height = 10, width = 5, ext = "jpg")
}
