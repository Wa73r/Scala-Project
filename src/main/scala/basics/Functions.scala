package basics

object Functions extends App {

  def aFunction(a: Int, b: Int) : String =
    "Multiplication is :: "+(a*b).toString

  println(aFunction(3,4))

  def noparameter : String = {
    "no param"
  }

    def anotherway() : String = {
      "another way"
    }

  println(noparameter)
  println(anotherway())

  //recursion
  def recursiveFunction(a: Int): Unit = {

    if(a > 1) recursiveFunction(a-1)
      println(a)
  }
  recursiveFunction(5)

  //Exercise
  //1. print hello with name and age
  def greeting(name: String, age: Int) = println("Hello, I am "+name+" and I am "+ age+" year old.")

  //2. factorial
  def factorial(n: Int): Int = {
    if(n>1) n*factorial(n-1)
    else 1
  }

  //3. fibonacci
  //1 1 2 3 5 8 13
  def fibonacci(n: Int): Int = {
    if(n>2) fibonacci(n-2)+fibonacci(n-1)
    else 1
  }

  //4. prime
  def primenumber(x: Int) : Boolean = {
    def isPrimeUntill(t: Int): Boolean = {
      if (t <= 1) true
      else x % t != 0 && isPrimeUntill(t - 1)
    }
    isPrimeUntill(x/2)
  }

  greeting("Kunal",25)
  println(factorial(5))
  println(fibonacci(7))
  println(primenumber(3))
  println(primenumber(7))
}
