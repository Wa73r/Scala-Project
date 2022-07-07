package basics

import scala.language.postfixOps

object Intro extends App {

  val a = 4;
  println(a)
  //a = 5 not valid
  var v = 45
  println(v)
  v =26
  println(v)

  //Instruction(Do) vs expression
  //Expression are 1+2 also for scala if is an expression as compared to other language in which it is instruction
  println(if(true) 45 else 3);

  //It is not good, why?
  var i = 0;
  val whilevalue = while (i < 3)
    {println(i)
    i += 1}

  //Everything is expression and if it does not seems like returning something it returns Unit
    println(whilevalue)

    val returntype = v = 1
    println(returntype)

    val codeBlocks = {
      val a = 1
     if(a==1) "yes" else "no"
      987
    }

    println(codeBlocks)
}
