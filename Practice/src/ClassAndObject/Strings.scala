object Strings{
  def main(arg:Array[String]): Unit = {
    val str: String="Hello, I am learning Scala"
    println(str.charAt(4))
    println(str.substring(7,13))
    println(str.split(" ").toList)
    println(str.startsWith("Hello"))
    println(str.startsWith("Hi"))
    println(str.replace(" ","$"))
    println(str.toLowerCase())
    println(str)
    println(str.toUpperCase())
    println(str.length)

    val numberString="45"
    val number=numberString.toInt
    println(number)
    println('a' +: numberString :+ 'z')
    println(str.reverse)
    println(str.take(5))


    //S-interpolation
    val name="David"
    val age=45
    val str1=s"Hello, My name is $name and I am $age years old"
    println(str1)
    val str2=s"Hello, My name is $name and I am turning ${age+1} years old"
    println(str2)

    //F-interpolation
    val speed=34.2f
    val str3=f"$name can eat $speed%2.2f burgers"
    println(str3)


    //raw interpolator
    println(raw"This is a \n newline")
    val escaped="THis is a \n newline"
    println(raw"$escaped")
  }
}