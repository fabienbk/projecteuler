package prob20

object FactorialDigitSum extends App {
  var f = BigInt(1)
  for(i <- 1 to 100) f *= i
  println(f)
  println(f.toString.map(_.asDigit).sum)
}



