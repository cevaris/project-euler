package main.euler

/**
 * Created by cevaris on 2/5/14.
 *
 *
 * https://projecteuler.net/problem=1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
class Prob1 extends Problems {


  def execute() {

//    var sum = 0
//    for( natrual <- 0 to 999 ){
//        if((natrual % 3  == 0) || natrual % 5  == 0) sum = sum+natrual
//    }
//    println( sum )

    val sum = ((0 to 999).filter(_ % 5 == 0) ++ ((0 to 999).toList.filter(_ % 3 == 0))).distinct.foldLeft(0)(_ + _)
    printf("%d".format(sum))
  }










}
