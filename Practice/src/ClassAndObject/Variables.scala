object Variables {
  def main(arg: Array[String]){
    println("This is from world class");
    var m1: Int=100
    val m2: String="This is first variable with datatype"
    var n1=20
    val n2="This is variable without datatype"
    println(m1,m2,n1,n2)
    m1=200
    n1=67
    //n1="String"
    //n2="String"
    println(m1,m2,n1,n2)
  }
}