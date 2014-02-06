package test.euler

import org.scalatest.FlatSpec
import java.util
import org.scalatest.matchers.Matchers

import main.euler.Prob1

/**
 * Created by cevaris on 2/5/14.
 */
class Prob1Test extends FlatSpec {

  behavior of "Problem 1"

  it should "work" in {
    val prob = new Prob1()
    prob.execute()
  }

//  it should "produce NoSuchElementException when head is invoked" in {
//    intercept[NoSuchElementException] {
//      Set.empty.head
//    }
//  }

}
