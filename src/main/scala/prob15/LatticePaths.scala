package prob15

/**
  * Created by Fabien Benoit-Koch on 10/02/2017.
  */
object LatticePaths extends App {

  val size = 3

  case class Node(var right: Boolean, var down: Boolean, var walked: Boolean)

  val lattice = Array.fill(size, size)(Node(true, true, false))
  for (node <- lattice(size - 1)) node.right = false
  for (i <- 0 to size - 1) lattice(i)(size - 1).down = false

  def count(): Int = {
    def _count(x: Int, y: Int): Int = {
      print(x + " " + y + " = ")

      val node = lattice(x)(y)
      if (node.right && node.down && !node.walked) {
        println("2")
        node.walked = true
        return 2 + _count(x + 1, y) + _count(x, y + 1)
      }
      println("0")
      return 0
    }
    return _count(0,0)
  }

  println(count())

}



