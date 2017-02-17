package prob17

object Prob17bis extends App {

  def count() : Int = {
    def n2count(n: Int, digits: String, tens: String) : Int = {
      return n match {
        case n if n < 20 => digits(n)
        case n if n < 100 && n % 10 == 0 => tens(n/10)
        case n if n < 100 => tens(n/10) + digits(n%10)
        case n if n < 1000 && n % 100 == 0 => digits(n / 100) + 7
        case n if n < 1000 => digits(n / 100) + 10 + n2count(n % 100, digits, tens)
        case 1000 => 11
      }
    }
    (for(i <- 1 to 1000) yield n2count(i, "43354435543668877988", "4366555766")).sum
  }

  println(count())

}



