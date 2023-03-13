import scala.annotation.tailrec
import scala.util.control.Breaks.break

object Functions{
  def main(arg: Array[String]): Unit = {
    def aFunction1(a:String,b:Int,c:Boolean) : String = {
      val z=a+' '+b+ " "+c
      z+"123"
    }

    val aFunction1Value=aFunction1("Hello Scala",200,false)
    println(aFunction1Value)

    def aParameterlessFunction() :Int = 36
    println(aParameterlessFunction())
    println(aParameterlessFunction)

    def aREpeatedFunction(aString: String, n: Int) : String={
      if(n==1) aString
      else aString+"\n"+aREpeatedFunction(aString,n-1)
    }
    println(aREpeatedFunction("Hello",5))

    def aFunctionWithSideEffects(aString:String):Unit=println(aString)
    aFunctionWithSideEffects("Display Directly")


    def aBiggerFunction(n:Int):Int={
      def aSmallerFunction(a:Int,b:Int):Int=a+b

      aSmallerFunction(n,n-1)
    }
    println(aBiggerFunction(2000))


    def greetingFunction(name:String,age:Int) :String={
      s"Hi, My name is $name and I am $age years old"
    }
    println(greetingFunction("Sonu",21))

    def nthFactorial(n:Int) :Int={
      if(n<=1) 1
      else n * nthFactorial(n-1)
    }
    println(nthFactorial(10))

    def nthFibonacci(n:Int):Int={
      if(n==1) 0
      else if(n==2) 1
      else nthFibonacci(n-1)+nthFibonacci(n-2)
    }
    println(nthFibonacci(8))

    def primeOrNot(n:Int):Boolean={
      def iterateNumber(a:Int):Boolean={
        if(a<=1) true
        else n% a!=0 && iterateNumber(a-1)
      }
      iterateNumber(n/2)
    }
    println(primeOrNot(14))

    def factorial(n:Int) :BigInt={
      def factHelper(a:Int,accumulator:BigInt):BigInt={
        if(a<=1) accumulator
        else factHelper(a-1,a * accumulator)
      }
      factHelper(n,1)
    }
    val k=factorial(10)
    println(k)

    def cocatenateString(aString:String,n:Int,accumulator:String):String=
      if(n<=0) accumulator
      else cocatenateString(aString,n-1,aString+"\n"+accumulator)
    println(cocatenateString("ScalaMnagaer",10,""))



    def isPrime(n:Int):Boolean={
      @tailrec
      def isPrimeHElper(a:Int,isStillPrime:Boolean):Boolean= {
        if(!isStillPrime) false
        else if(a<=1) true
        else isPrimeHElper(a-1,n%a!=0 && isStillPrime)
      }
      isPrimeHElper(n/2,true)
    }
    println(isPrime(29))
    println(isPrime(629))


    def fibonacci(n:Int):Int={
      def fibonacciHelper(i:Int,last:Int,nextToLast:Int):Int=
        if(i>n) last
        else fibonacciHelper(i+1,last+nextToLast,last)

      if(n<=2) 1
      else fibonacciHelper(3,1,1)
    }
    println(fibonacci(8))
  }

}