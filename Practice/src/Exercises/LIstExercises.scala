package Exercises

import scala.language.postfixOps

object LIstExercises extends App{
  val fruit = List("Mango","Orange","Apple")
  println(fruit)
  val fruitlist = List("Mango","Orange",10)
  println(fruitlist)
  val numbers = List(10,20,30,22,4,7,8,0,7,4,2)
  println(numbers)
  val empty = List()
  println(empty)
  val multidim = List(1,List(2,5,8),List("fruits"),0)
  println(multidim)
  println(numbers take 5)  //displays first 5 elements
  println(numbers drop 5)  // displats rest elements other than first 5
  println(numbers(5))
  println(numbers ++ fruit)
  println(numbers reverse)
  println(numbers updated (5,"hujiko"))  //creates new list by updating  value at index 5
  println(numbers)
  println(numbers indexOf(23)) //index of first occurrence of 23
  println(numbers contains(23))  //checks present or not
}
