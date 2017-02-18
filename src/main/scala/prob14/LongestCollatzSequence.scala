package prob14

import scala.collection.mutable
import scala.collection.mutable.Map
import scala.util.control.Breaks._

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object LongestCollatzSequence extends App {

  var chain = Map[Long, Long](1L -> 1L)

  def collatz(n : Long) : Long = {
    def compute(n : Long, acc : List[Long]) : Long = {
      return n match {
        case n if chain contains n => {
          (n :: acc).zipWithIndex.foreach {
            tuple =>  if (!chain.contains(tuple._1)) {
              chain += (tuple._1 -> (tuple._2 + chain(n)))
            }
          }
          return acc.length + chain(n)
        }
        case _ => compute(if (n % 2 == 0) (n/2) else (3*n+1), n :: acc)
      }
    }

    return compute(n, Nil)
  }


  var memo = Array.fill(1100000)(-1)

  def searchBest(): Int = {
    var currentBestN = 1
    var currentBestLength = 1

    for(n <- 1 to 1000000) {
      var length : Int = 0
      var currentN : Long = n
      breakable {
      do {
        currentN = currentN match {
          case x if x % 2 == 0 => x/2
          case x => 3*x + 1
        }
        length += 1
        if (currentN < memo.length && memo(currentN.toInt) != -1) {
          length = length + memo(currentN.toInt)
          break
        }
      } while (currentN != 1L)
      }

      memo(n) = length

      if (length > currentBestLength) {
        currentBestLength = length
        currentBestN = n
      }
    }
    return currentBestN;
  }


  for (i <- 1 to 10) {
    val t = System.currentTimeMillis()
    val best = searchBest()
    println(best)
    val t2 = System.currentTimeMillis()
    println((t2 - t))
  }
}
