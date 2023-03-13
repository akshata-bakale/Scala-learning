package Exercises

object BinaryTree extends App {
  val t1 = new NonEmpty(3,new Empty,new Empty)
  println(t1)
  val t2 = t1 incl 4
  println(t2)
  val t3 = t2 incl 1
  println(t3)
  println(t3 contains 1)

  val m1 = new NonEmpty(5, new Empty, new Empty)
  println(m1)
  val m2 = m1 incl 2
  println(m2)
  val m3 = m2 incl 0
  println(m3)
  println(m3 contains 1)

  println(t3 union m3)
}


abstract class IntSet{
  def incl(x : Int) :IntSet
  def contains(x : Int) : Boolean
  def union(other: IntSet) : IntSet
}
class Empty extends IntSet{
  def contains(x : Int) : Boolean = false
  def incl(x : Int) : IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
  def union(other: IntSet) : IntSet = other
}
class NonEmpty(elem : Int, left : IntSet, right : IntSet) extends IntSet{
  def contains(x : Int): Boolean = {
    if(x<elem) left contains x
    else if(x>elem) right contains x
    else true
  }
  def incl(x : Int) : IntSet = {
    if(x<elem) new NonEmpty(elem,left incl x,right)
    else if(x>elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  override def toString = "{"+left+elem+right+"}"
  def union(other : IntSet) : IntSet =
    ((left union right) union other) incl elem
}