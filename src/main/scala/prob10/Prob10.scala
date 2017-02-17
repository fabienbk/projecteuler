package prob10

import common.Primes.isPrime

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object Prob10 extends App {

  var sum = 0L
  for(i <- 0 to 2000000) {
    if (isPrime(i)) {
      sum += i
    }
  }

  println(sum)

}
