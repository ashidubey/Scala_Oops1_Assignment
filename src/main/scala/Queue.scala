import scala.collection.mutable.ListBuffer
trait Queue{
  def dequeue( list: ListBuffer[Int]){

    list.remove(0)
  }
  def enqueue(list: ListBuffer[Int]){
    var num=100
    list.addOne(num)
  }
}