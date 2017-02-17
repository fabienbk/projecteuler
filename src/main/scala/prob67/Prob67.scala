package prob67

import scala.io.Source

object Prob67 extends App {
  val filename = "src/prob67/data"
  val lines : Array[String] = Source.fromFile(filename).getLines().to
  var data = lines.reverse.map(_.split(" ").map(_.toInt))

  for(i <- 1 to data.length-1) {
    for(n <- 0 to data(i).length-1 ) {
      data(i)(n) += data(i - 1)(n) max data(i - 1)(n+1)
    }
  }

  println(data(data.length - 1)(0))
}



