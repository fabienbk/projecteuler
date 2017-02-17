package prob25

import scala.math.ScalaNumber._

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object Prob25 extends App {

  val Zero = BigInt(0)

  def countDigits(fn: BigInt) : Int = {
    def countDigits(fn: BigInt, acc: Int) : Int = fn match {
      case Zero => acc;
      case _ => countDigits(fn / 10, acc + 1)
    }
    countDigits(fn, 0)
  }

  def find(digits: Int): BigInt = {
    def find(n: BigInt, fn: BigInt, previous: BigInt): BigInt = {
      if (countDigits(fn) >= digits) n else {
        find(n+1, fn+previous, fn)
      }
    }
    find(2, 1, 1)
  }

  println(find(1000))
}

