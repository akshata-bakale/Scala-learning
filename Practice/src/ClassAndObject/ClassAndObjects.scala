import scala.language.postfixOps

class AddClass(val x:Int,val y:Int){
  var xc=x
  var yc=y

  def display(): Unit = {
    println(xc+5)
    println(yc+7)
  }
}
object ClassAndObjects{
  def main(arg: Array[String]): Unit = {
    var newObject=new AddClass(10,20)
    newObject.display()

    val mary = new Person("Mary","KGF2",0)
    println(mary)
    //infix notation(Syntactic Sugar)
    println(mary.likes("KGF2"))
    println(mary.likes("KGF1"))
    println(mary likes "KGF2")

    val tom = new Person("Tom","rrr",23)
    println(mary hangOUtWith tom)
    println(mary + tom)

    println(1.+(29))

    //Prefix notation
    val x = -1 // equivalent to unary_
    val y = 1.unary_~
    println(y)
    println(!mary)
    println(mary.unary_!)


    //apply
    println(mary.apply())
    println(mary.apply)
    println(mary)
    println(mary())


    println((mary + "The Rockstar").apply())
    println((+mary).age)

    println(mary learns "Python")
    println(mary learnsScala)

    println(mary(20))
  }
}

class Person(val name: String, favoriteMovie: String, val age : Int){
  def likes(movie: String) : Boolean = movie==favoriteMovie
  def hangOUtWith(person: Person) : String = s"${this.name} is hanging out with ${person.name}"
  def +(person: Person) : String = s"${this.name} is hanging out with ${person.name} with operator"
  def +(nickname : String) : Person = new Person(s"$name ($nickname)",favoriteMovie,age)
  def unary_+ : Person = new Person(name, favoriteMovie, age+1)
  def unary_! : String = s"$name is hacked"
  def apply() : String = s"I am $name and I like $favoriteMovie"
  def apply(n : Int) : String =s"$name watched $favoriteMovie $n times"
  def learns(thing : String) : String = s"$name learns $thing"
  def learnsScala = this learns "Scala"
}