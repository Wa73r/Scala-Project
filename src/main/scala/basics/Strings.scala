package basics

object Strings extends App {


  val aNumber = "42"
  val reverse: String = aNumber.reverse
  println(aNumber.toInt +" "+ reverse)

  //prepending and appending operator
  val concat = 'a' +: aNumber :+ 'z'

  val name = "Kunal"
  val age = "25"
  val marks = 84.5f
  //S-Interpolation
  val sInterpolated = s"hi, i am $name & i am $age year old and i'll be turning ${age.toInt+1} year"
  println(sInterpolated)

  //F-Interpolation
  val fInterpolated = f"Hi, $name got $marks%2.2f in exam"
  println(fInterpolated)

  //raw-Interpolation
  val rawInterpolation = raw"hi $name, there should be new line \n after this"
  print(rawInterpolation)
}
