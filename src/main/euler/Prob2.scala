package main.euler

import org.scalatest.FlatSpec
import util.control.Breaks._


/**
 * Created by cevaris on 2/6/14.
 *
 * https://projecteuler.net/problem=2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
class Prob2 extends FlatSpec with Problems {


  def execute() {


//    var prev = 0 : Long
//    var curr = 1 : Long
//    val evenFibs = List[Integer]()
//    var sum = 0  : Long
//    val max = (4000000)
//
//    breakable {
//      for(i <- 0 to Integer.MAX_VALUE-1 ){
//        val next = prev + curr
//        prev = curr
//        curr = next
//
//        if(next > max) break;
//
//        if(next % 2 == 0) sum += next
//      }
//    }
//    printf(s"Sum: $sum")
//    printList(evenFibs)


    do {     |   x = x + 1     | } while (x < 10)

  }


  it should "execute" in {
    new Prob2().execute()
  }

}
