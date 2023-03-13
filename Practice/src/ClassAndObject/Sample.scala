object Sample{
  def main(arg: Array[String]): Unit = {
    val aCondition=false
    val aConditionedValue=if(aCondition) "True Value" else "False Value"
    println(aConditionedValue)

    val aCodeBlock={
      val x=20
      val y="String value"

      if(x>100) "True CodeBlock" else "False CodeBlock"
    }
    println(aCodeBlock)

    val aSomeValue={
      10 <= 5
    }
    val aSomeOtherValue={
      if(aSomeValue) "TRue SomeValue" else 45
      67
    }
    println(aSomeOtherValue)
  }
}