package prob11

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object LargestProductInAGrid extends App {

  val buffer = ListBuffer[ListBuffer[Int]]()
  def value(x : Int)(y: Int) = try { buffer(x)(y) } catch { case _ : Throwable => 0 }

  val filename = "src/prob11/data"
  for (line <- Source.fromFile(filename).getLines()) {
    buffer += line.split(" ").to[ListBuffer].map(_.toInt)
  }

  val list = for(x <- 0 to 19; y <- 0 to 19; xi <- -1 to 1; yi <- -1 to 1 if yi != 0 && xi != 0)
  yield (value(x)(y) * value(x+xi)(y+yi) * value(x+xi*2)(y+yi*2) * value(x+xi*3)(y+yi*3))

  println(list.max)
}
