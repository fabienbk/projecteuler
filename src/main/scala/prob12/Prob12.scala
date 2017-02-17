package prob12

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Highly divisible triangular number
  */
object Prob12 extends App {

  var divisors = 0
  var num : Int = 0
  var i = 0

  def divisorsOf(num: Int) : Int = {
    var divisor : Int = 2
    var count = 2
    while(divisor <= num / 2) {
      if (num % divisor == 0) {
        count += 1
      }
      divisor += 1
    }
    return count
  }

  def tri(n : Int) = (n*(n+1)) / 2



  while(divisors <= 500) {
    i = i + 1
    num += i
    divisors = divisorsOf(num)
    if (divisors > 100) println(s"${num} => ${divisors}")
  }

}
