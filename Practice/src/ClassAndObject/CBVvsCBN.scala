object CBVvsCBN{
  def main(arg :Array[String]): Unit = {
    def callByValue(x : Long): Unit = {
      println("Value = "+x)
      println("Value : "+x)
    }
    def callByName(x : => Long): Unit = {
      println("Value = "+x)
      println("Value = "+x)
    }
    callByValue(System.nanoTime())
    callByName(System.nanoTime())
  }
}