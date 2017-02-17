package prob16

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object Prob16 extends App {

  val res = BigInt(2).pow(1000).toString().map(_.asDigit).sum
  println(res)

}



