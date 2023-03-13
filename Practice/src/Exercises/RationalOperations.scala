package Exercises

object RationalOperations extends App{
  val x = new Rational(1,3)
  println(x.numer)
  println(x.denom)

  val y = new Rational(5,7)
  println(x + y)

  println(x.neg)

  println(x - y)

  val z = new Rational(3,2)
  println(x - y - z)

  println(x + y * z)

  println(y + y)

  println(x less y)
  println(x max y)

  val invalidNumber = new Rational(1,0)
//  println(invalidNumber + invalidNumber)
}
class Rational(x : Int, y : Int){
  //Requirements
  require(y!=0, "Denominator must be non-zero")
  def numer = x
  def denom = y

  def +(another : Rational) : Rational ={
    new Rational(numer * another.denom + denom * another.numer, denom * another.denom)
  }

  def neg: Rational = new Rational(if(x<0) x else -x,y)

  def -(another: Rational): Rational = {
    new Rational(numer * another.denom - denom * another.numer, denom * another.denom)
  }
  override def toString : String = {
    def gcd(a : Int, b : Int) : Int = if(b==0) a else gcd(b,a % b)
    val g = gcd(numer,denom)
    numer/g + "/" + denom/g
  }

  def *(another: Rational): Rational = {
    new Rational(numer * another.numer, denom * another.denom)
  }

  def less(another: Rational): Boolean = if(this.numer * another.denom < this.denom * another.numer) true else false

  def max(another: Rational): Boolean = if(!this.less(another)) true else false

}