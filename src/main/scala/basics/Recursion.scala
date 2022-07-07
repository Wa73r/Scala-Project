package basics

object Recursion extends App {

  //stackoverflow at 50000
  def factorial(n: Int): BigInt = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  //  println(factorial(50000))

  def trFactorial(n: Int): BigInt =
    def tailRecursiveFactorial(n: Int, acc: Int): BigInt = {
      if (n <= 1) acc
      else tailRecursiveFactorial(n - 1, n * acc)
    }

    tailRecursiveFactorial(n, 1)

  println(trFactorial(50000))

  //1. Concat Strings
  def concatTailRec(str: String, n: Int): String = {
    def concatHelper(s: String, n: Int, acc: String): String = {
      if (n <= 1) acc
      else concatHelper(s, n - 1, s + acc)
    }

    concatHelper(str, n, str)
  }

  println(concatTailRec("pqr", 5))

  //2. isPrime function
  def isPrimeTailRec(n: Int): Boolean = {
    def isPrimeHelper(t: Int, acc: Boolean): Boolean =
      if (t <= 1) acc
      else isPrimeHelper(t - 1, n % t != 0 && acc)

    isPrimeHelper(n / 2, true)
  }

  println(isPrimeTailRec(5))

  //3. Fibonacci function
  def fibonacciTailRec(n: Int): Int = {
    def fibonacciHelper(x: Int, acc1: Int, acc2: Int): Int = {
      if (x <= 2) acc2
      else fibonacciHelper(x-1, acc2, acc1+acc2)

    }
    fibonacciHelper(n, 1, 1)
  }

  //1 1 2 3 5 8 13 21
  println(fibonacciTailRec(8))
}
