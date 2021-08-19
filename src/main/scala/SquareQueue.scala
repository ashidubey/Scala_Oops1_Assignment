import scala.collection.mutable.ListBuffer

class SquareQueue(l:ListBuffer[Int]) extends Queue{
  for( i <-0 to l.length-1) { // Iterating the list
    l.update(i, l(i) * l(i))
  }

}