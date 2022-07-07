package basics

object CBNvCBV extends App {

  def callByName(x: Long): Unit = {
    println("call by name : "+ x)
    println("call by name : "+ x)
  }

  def callByValue(x: => Long): Unit = {
    println("call by value : "+ x)
    println("call by value : "+ x)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())

  //lazy evaluation example

  def infinite() : Int = 1+infinite()

  def lazyEvalExample(a: Int, b: => Int): Unit = {
    println(a)
  }
  lazyEvalExample(1,infinite())

  //will result in stackoverflow
//  lazyEvalExample(infinite(),1)
}
