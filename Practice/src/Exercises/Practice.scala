package Exercises

import scala.annotation.tailrec

object Practice extends App{
    println("Hello " + "hii" +"Scala!!!!")
    println(1+2)
    println("Pnumonia".size)
    val string="Pneumonia"
    println(string.take(3))
    val range=1.to(10)
    println(range)
    println(string.toUpperCase())
    println(-42.abs)
    //  println(1 to "hi")  type mismatch error
    println(32.toHexString)  //converts decimal to hexadecimal
    println((0 to 10) contains 10)   //true
    println((0 until 10) contains 10)  //false

    def square(x: Int) = x*x
    println(square(3))

    def twoDecimal(c: String)(x: Double): String =  c.format(x)
    def area(radius: Int) ={
        val a = Math.PI * square(radius)
        //      a
        twoDecimal("%5.2f")(a)
    }
    println(area(10))

    def sumOfSquares(x: Int, y: Int) = square(x) + square(y)
    println(sumOfSquares(3,4))

    def loop: Int = {
        println("1")
        loop
    }
    //    println(loop)  // infinite 1's

    def triangleArea(base: Double,height: Double): Double = base * height / 2
    println(triangleArea(3,4))
    println(triangleArea(5,6))

    def abs(x: Double) =
        if(x<0) -x
        else x
    def improve(guess: Double,x: Double) : Double = (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
        abs(guess * guess - x) / 2 < 0.001
    def sqrtIter(guess: Double, x: Double): Double =
        if(isGoodEnough(guess,x)) guess
        else sqrtIter(improve(guess,x),x)
    def sqrt(x: Double) = sqrtIter(1.0,x)
    println(sqrt(2))

    for(i<-1 to 10) {
        println(i)
    }
    val result = for(a<-1 to 5) yield a
    println(result)
    result.foreach((element: Int) => print(element + " "))
    val lst = List(1,3,4,6,7)
    println(lst)
    lst.foreach((element: Int) => print(element + " "))
    println()

    def factorial(n: Int): Unit = {
        var fact = 1
        for(x<-1 to n){
            fact = fact * x
            println(fact)
        }
    }
    factorial(5)

    val x = 0
    def f(y: Int) = y + 1
    val results = {
        val x = f(3)
        x * x
    } + x
    println(results)

    object Foo {
        val x = 1
    }
    object Bar {
        val x = 2
    }
    object Baz {
        val y = Bar.x + Foo.x
    }
    println(Baz.y)


    def gcd(x:Int,y:Int): Int=
        if(y==0) x
        else gcd(y,x%y)
    println(gcd(12,8))


    def factorialHelper(n: Int): Int = {
        if(n<=1) 1
        else {
            println(s"Computing factorial of $n, need factorial of ${n-1}")
            val r=n * factorialHelper(n-1)
            println(s"Computed factorial of ${n-1}")
            r
        }
    }
    //    println(factorialHelper(5000))

    def factorial1(n: Int): BigInt = {
        @tailrec
        def iter(x: Int, result: BigInt): BigInt =
            if (x <= 1) result
            else {
                iter(x - 1, result * x)
            }
        iter(n,1)
    }
    println(factorial1(5000))


    case class Note(name: String, duration: String, octave: Int)
    val c3 = Note("C", "Quarter", 3)
    val otherC3 = Note("C", "Quarter", 3)
    val f3 = Note("F", "Quarter", 3)
    println(c3==otherC3)
    println(c3==f3)


    sealed trait Duration
    case object Whole extends Duration
    case object Half extends Duration
    case object Quarter extends Duration
    def fractionOfWhole(duration: Duration): Double =
        duration match {
            case Whole => 1.0
            case Half => 0.5
            case Quarter => 0.25
        }
    println(fractionOfWhole(Half))


    def sum(f: Int => Int, a: Int, b: Int): Int =
        if (a > b) 0
        else f(a) + sum(f, a + 1, b)
    def id(x: Int) = x
    def cube(x: Int) = x * x * x

    def sumInts(a: Int,b: Int) = sum(id,a,b)
    def sumSquares(a: Int, b: Int) = sum(square, a, b)
    def sumCubes(a: Int,b: Int) = sum(cube, a, b)

    println(sumInts(3,6))
    println(sumSquares(3,6))
    println(sumCubes(3,6))

    val myList = List(2,8,6,5)
    println(myList.map(x=>x+2))
    println(for(x<-myList) yield x+2)
    println(myList)
    println(myList.filter(x=>x%2==0))
    println(myList.flatMap{ x=>
        List(x,x*2,x*3)                                   // 2,2*2,2*3  = 2,4,6
    })                                                    // 8,8*2,8*3  = 8,16,24
                                                          // 6,6*2,6*3  = 6,12,18
                                                          // 5,5*2,5*3  = 5,10,15
     val mytuple = (23,"gyh",5.7)
    println(mytuple._1)
    println(mytuple._2)
    println(mytuple._3)

    //tuples have indexes mytuple._i
    //list cannot retrieved using indexes

    println(Range(2,10,2))
    def average(x: Int,xs: Int*): Double = (x::xs.toList).sum.toDouble / (xs.size + 1)
    println(average(3,5,7))

    abstract class Reducer(init: Int) {
        def combine(x: Int, y: Int): Int
        def reduce(xs: List[Int]): Int =
            xs match {
                case Nil => init
                case y :: ys => combine(y, reduce(ys))
            }
    }
    object Product extends Reducer(1) {
        def combine(x: Int, y: Int): Int = x * y
    }
    object Sum extends Reducer(0) {
        def combine(x: Int, y: Int): Int = x + y
    }
    val nums = List(1, 2, 3, 4)
    println(nums(0))
    println(Product.reduce(nums))
    println(Sum.reduce(nums))

    for(x<-1 to 7) print(x+ " ")
    println()
    for(x<-1 until 3; j<-"hii";k<-"jk") println(s"$x $j $k")



}
