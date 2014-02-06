package main.euler

/**
 * Created by cevaris on 2/5/14.
 */
trait Problems {

  def printList(args: List[_]): Unit = {
    args.foreach(println)
  }

  def printList(args: Vector[_]): Unit = {
    args.foreach(println)
  }

  def printList(args: IndexedSeq[_]): Unit = {
    args.foreach(println)
  }

}
