package prob10

import common.Primes

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object SummationOfPrimes extends App {


  var sum = 0L
  for(i <- 0 to 2000000) {
    if (Primes.isPrime(i)) {
      sum += i
    }
  }
 
  /* This is problably better done with a fold  */

  sum = Range(1, 2000000).filter(Primes.isPrime _).foldLeft(_+_)
 
  /* Or even better */
 
  def isPrime = Primes.isPrime
  sum = Range(1, 2000000).filter(isPrime _).sum

  
  
 
 
 
 
 
 
 
 

  println(sum)

}
