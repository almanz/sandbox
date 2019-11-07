/*
This code implements the 99 scala problems
link: http://aperiodic.net/phil/scala/s-99/
* */
import scala.collection.immutable._

object HelloWorld {
  val container:List[Int] = List(1,2,3,4,5)
  // Find the last element of a list
  def p1:Any = {
    container.last
  }
  // Find the second to last element of a list. Hint: Use pattern matching
    def p2(ls:List[Int]):Any = {
      ls match {
        case x :: _ :: Nil => x
        case _ :: tail => p2(tail)
        case _ => s"The passed in Sequence does not satisfy the predicate."
      }
    }
  def main(args: Array[String]): Unit = {
    println(p1)
    println(p2(container))



  }
}
