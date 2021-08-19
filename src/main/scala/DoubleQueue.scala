import scala.collection.mutable.ListBuffer

class DoubleQueue( l:ListBuffer[Int]) extends Queue {

  for (i <- 0 to l.length - 1) {
    l.update(i, 2 * l(i))

  }
}
