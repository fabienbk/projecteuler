package prob17
import scala.collection.immutable.Seq

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object Prob17 extends App {

  val digits  = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
    "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
  val tens    = List("zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
  val hundred = "hundred"
  val thousand = "one thousand"

  def number2name(number: Int) : String = {
    return number match {
      case number if number < 20 => digits(number)
      case number if number < 100 && number % 10 == 0 => tens(number/10)
      case number if number < 100 => tens(number/10) + "-" + digits(number%10)
      case number if number < 1000 && number % 100 == 0 => digits(number / 100) + " " + hundred
      case number if number < 1000 => digits(number / 100) + " " + hundred + " and " + number2name(number % 100)
      case 1000 => thousand
      case _ => throw new IllegalArgumentException("Must be positive and <= 100")
    }
  }

  val res = (for(i <- 1 to 1000) yield number2name(i).replaceAll("[ \\-]", "").length)
  println(res.sum)
}



