import scala.collection.mutable.ListBuffer

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object Primes {

  val fibSequenceList = ListBuffer(0, 1)

  def fib(n : Int) : Int = {
    if (n < fibSequenceList.length) {
      return fibSequenceList(n);
    }
    for(i <- fibSequenceList.length to n + 1) {
      fibSequenceList += fibSequenceList(i-1) + fibSequenceList(i-2)
    }
    return fibSequenceList(n)
  }

  def isPrime(n : Int) : Boolean = {
    return n match {
      case n if n <= 1 => false
      case n if n <= 3 => true
      case n if (n % 2 == 0 || n % 3 == 0) => false
      case _ => {
        var i = 5
        while (i*i <= n) {
          if (n % i == 0 || n % (i + 2) == 0) return false
          i += 6
        }
        true
      }
    }

  }

}
