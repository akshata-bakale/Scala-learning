package Practice
import scala.io.StdIn.{readLine, _}
abstract class Question{
    def displayQuestion(): Unit
    def init(): Unit
}
class Question1(var x: Int = 1,var y: Int = 1) extends Question{
    override def displayQuestion(): Unit = println("Question 1 : Write a Scala program to compute the sum of the two given integer values. " +
        "If the two values are the same, then return triples their sum. ")
    override def init(): Unit = {
        print("Enter inputs in single line ")
        val arr = readLine().split(" ").map(_.toInt).toList
        this.x = arr.head
        this.y = arr(1)
    }
    private def question1(a: Int, b: Int):Int = {
        def sum(a: Int, b: Int): Int = a + b
        def solution1(a: Int, b: Int): Int =
            if (a == b) 3 * sum(a, b)
            else sum(a, b)
        solution1(a,b)
    }
    override def toString: String = s"Solution 1 : x=$x and y=$y, solution sum = ${question1(x,y)}"
}
class Question2(var n: Int = 0) extends Question{
    override def displayQuestion(): Unit = println("Question 2 : Write a Scala program to get the absolute difference between n and 51. " +
        "If n is greater than 51 return triple the absolute difference.")
    override def init(): Unit = {
        print("Enter inputs in single line ")
        this.n = readInt()
    }
    private def question2(n: Int):Int = {
        def abs(x: Int): Int =
            if(x<0) -x else x
        def solution2(x: Int): Int =
            if (x>51) 3 * abs(x-51)
            else abs(x - 51)
        solution2(n)
    }
    override def toString: String = s"Solution 2 : n=$n , solution absolute difference= ${question2(n)}"
}
class Question3(var a: Int = 0,var b: Int = 0) extends Question{
    override def displayQuestion(): Unit = println("Question 3 : Write a Scala program to check two given integers, " +
        "and return true if one of them is 30 or if their sum is 30.")
    override def init(): Unit ={
        print("Enter inputs in single line ")
        val arr = readLine().split(" ").map(_.toInt).toList
        this.a = arr.head
        this.b = arr(1)
    }
    private def question3(m: Int, n: Int):Boolean = {
        def sum(x: Int, y: Int): Int = x + y
        def solution3(x: Int, y: Int): Boolean = {
            if (x==30 || y==0) true
            else if(sum(x,y)==30) true
            else false
        }
        solution3(m,n)
    }
    override def toString: String = s"Solution 3 : a=$a and b=$b , solution = ${question3(a,b)}"
}
class Question4(var n: Int = 0) extends Question{
    override def displayQuestion(): Unit = println("Question 4 : Write a Scala program to check a given integer and " +
        "return true if it is within 20 of 100 or 300. ")
    override def init(): Unit = {
        print("Enter inputs in single line ")
        this.n = readInt()
    }
    private def question4(x: Int):Boolean = {
        def abs(y: Int): Int =
            if (y < 0) -y else y
        if (abs(100 - x) <= 20 || abs(300 - x) <= 20) true
        else false
    }
    override def toString: String = s"Solution 4 : n=$n , solution = ${question4(n)}"
}
class Question5(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 5 : Write a Scala program to create a new string where 'if' " +
        "is added to the front of a given string. If the string already begins with 'if', return the string unchanged. ")
    override def init(): Unit = {
        this.str = readLine("Enter your string input ")
    }
    private def question5(x: String): String= {
        if((x take 2) == "if") x
        else "if"+x
    }
    override def toString: String = s"Solution 5 : string=$str , solution = ${question5(str)}"
}
class Question6(var str: String = "",var n: Int = 0) extends Question{
    override def displayQuestion(): Unit = println("Question 6 : Write a Scala program to remove the character in a given position of a " +
        "given string. The given position will be in the range 0...string length -1 inclusive.")
    override def init(): Unit = {
        print("Enter the original string : ")
        while (this.str == "")
            this.str = readLine()
        print(s"Enter index to be deleted (0 to ${str.size - 1}) : ")
        this.n = readInt()
    }
    private def question6(origin: String, index: Int):String = {
        if(n<0 || n>=origin.length) throw new IndexOutOfBoundsException("invalid index range")
        else{
            val head = origin take index
            val tail = origin drop index+1
            head + tail
        }
    }
    override def toString: String = s"Solution 6 : Original string = $str and index = $n , solution = ${question6(str,n)}"
}
class Question7(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 7 : Write a Scala program to exchange the first and last characters "+
        "in a given string and return the new string.")
    override def init(): Unit = {
        print("Enter the original string : ")
        while(this.str == "")
            this.str = readLine()
    }
    private def question7(origin: String):String = {
        origin.charAt(origin.length-1) + origin.substring(1,origin.length-2) + origin.charAt(0)
    }
    override def toString: String = s"Solution 7 : Original string = $str , solution = ${question7(str)}"
}
class Question8(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 8 : Write a Scala program to create a new string which is 4 copies " +
        "of the 2 front characters of a given string.If the given string length is less than 2 return the original string. ")
    override def init(): Unit = {
        print("Enter the original string : ")
        this.str = readLine()
    }
    private def question8(origin: String):String = {
        if(origin.length>2) origin.take(2) * 4
        else origin
    }
    override def toString: String = s"Solution 8 : Original string = $str , solution = ${question8(str)}"
}
class Question9(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 9 : Write a Scala program to create a new string with the " +
        "last char added at the front and back of a given string of length 1 or more.")
    override def init(): Unit = {
        print("Enter the original string : ")
        this.str = readLine()
    }
    private def question9(origin: String):String = {
        if(origin.length<=0) origin
        else origin.charAt(origin.length-1) + origin + origin.charAt(origin.length-1)
    }
    override def toString: String = s"Solution 9 : Original string = $str , solution = ${question9(str)}"
}
class Question10(var number: Int = 0) extends Question{
    override def displayQuestion(): Unit = println("Question 10 : Write a Scala program to check whether a given positive " +
        "number is a multiple of 3 or a multiple of 7.")
    override def init(): Unit = {
        print("Enter the positive number : ")
        this.number = readInt()
    }
    private def question10(num: Int):Boolean = {
        if(num % 3 == 0 || num % 7 == 0) true
        else false
    }
    override def toString: String = s"Solution 10 : Given number = $number , multiple of 3 or 7 = ${question10(number)}"
}
class Question11(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 11 : Write a Scala program to create a new string taking the " +
        "first 3 characters of a given string and return the string with the 3 characters added at both the front and back. " +
        "If the given string length is less than 3, use whatever characters are there. ")
    override def init(): Unit = {
        print("Enter the original string : ")
        while(this.str == "")
            this.str = readLine()
    }
    private def question11(origin: String):String = {
        if(origin.length<3) origin * 3
        else{
            val first3 = origin take 3
            first3 + origin + first3
        }
    }
    override def toString: String = s"Solution 11 : Original string = $str , solution = ${question11(str)}"
}
class Question12(var str: String = "") extends Question{
    override def displayQuestion(): Unit = println("Question 12 : Write a Scala program to check whether a given string starts with 'Sc' or not.")
    override def init(): Unit = {
        print("Enter the string : ")
        while(this.str == "")
            this.str = readLine()
    }
    private def question12(origin: String):Boolean = {
        if(origin.startsWith("Sc")) true
        else false
    }
    override def toString: String = s"Solution 12 : Original string = $str , starts with \"Sc\" => ${question12(str)}"
}
object Questions12 extends App{
    println("Enter question number 1 - 12 ( 0 for exit )")
    var choice = readInt()
    while(true) {
        choice match {
            case 0 => println("Thank you!!!!")
                      System.exit(0)
            case 1 => val Q= new Question1
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 2 => val Q = new Question2
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 3 => val Q = new Question3
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 4 => val Q = new Question4
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 5 => val Q = new Question5
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 6 => val Q = new Question6
                      Q.displayQuestion()
                      try {
                          Q.init()
                          println(Q)
                      }catch{
                          case e: Throwable => println(e)
                      }

            case 7 => val Q = new Question7
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 8 => val Q = new Question8
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 9 => val Q = new Question9
                      Q.displayQuestion()
                      Q.init()
                      println(Q)

            case 10 => val Q = new Question10
                       Q.displayQuestion()
                       Q.init()
                       println(Q)

            case 11 => val Q = new Question11
                       Q.displayQuestion()
                       Q.init()
                       println(Q)

            case 12 => val Q = new Question12
                       Q.displayQuestion()
                       Q.init()
                       println(Q)

            case _ => println("not yet formed")
        }
        println("Enter choice again!!!")
        choice = readInt()
    }
}

