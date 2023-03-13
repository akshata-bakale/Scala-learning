package PatternMatching

import scala.util.Random

object PatternMatching extends App{
  val random = new Random
  println(random)
  val x = random.nextInt(10)
  println(x)
  val description = x match {
    case 1 => "the one"
    case 2 => "double double"
    case 3 => "tripless"
    case _ => "default"
  }
  println(description)


  //Decompose values
  case class Person(name: String,age: Int)
  val bob = Person("Bob",17)
  val greeting = bob match {

    case Person(n,a) => s"Hi, My name is $n and I am $a years old"
    case Person(n,a) if a<18 => s"Hi, My name is $n and I cannot vote"
    case _ => "I don't know who I am"
  }
  println(greeting)

  /*
  1.cases are matched in order
   */
}
