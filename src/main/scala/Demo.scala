import scala.collection.mutable.ListBuffer

object demo{
  def main(args:Array[String]){

    val list = ListBuffer(0, 1, 4, 12, 8, 85, 27, 19, 5)
    println(list)
    var s= new DoubleQueue(list)

    s.dequeue(list)
    println(list)
    s.enqueue(list)
    println(list)

    var w=new SquareQueue(list)
    println(list)

  }
}