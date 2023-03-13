object Inheritance{
  def main(arg : Array[String]): Unit = {
    val cat = new Cat
    cat.crunch

    val dog = new Dog
    dog.eat
    println(dog.creatureTYpe)

    val cow = new Cow("farmer friend")
    cow.eat
    println(cow.creatureTYpe)
  }
}

// Single class inheritance
class Animal{
  val creatureTYpe="wild"
  protected def eat = println("nom nom nom")
}

class Cat extends Animal{
  def crunch ={
    eat
    println("crunch crunch")
  }

}


//Constructors
class Person1(name : String, age : Int){
  def this(name : String) = this(name,0)
}
class Adult(name : String, age : Int, id : String) extends Person1(name,age)
class Child(name : String, age : Int, id : String) extends Person1(name)

//Overriding
class Dog extends Animal{
  override val creatureTYpe="domestic"
  override def eat = println("doggy crunch crunch")
}
class Cow(override val creatureTYpe : String) extends Animal{
  override def eat = println("cow crunch crunch")
}