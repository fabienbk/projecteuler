package prob13

import scala.io.Source

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object LargeSum extends App {

  val filename = "src/prob13/data"

  var acc : BigInt = 0

  for (line <- Source.fromFile(filename).getLines()) {
    acc += BigInt(line)
  }

  println(acc.toString().substring(0, 10))
}
