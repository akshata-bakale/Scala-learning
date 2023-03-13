package Exercises

object CollectionSeq extends App{
    // SEQUENCE PROPERTIES
    /*
    1. It is a trait
    2. Indexed sequences
    3. Methods always returns List
     */
    var seq = Seq(52,85,1,5,78,9,3,2,1)
    println(seq)

    //Accessing element using index
    println(seq(2))     // index => element
    println(seq.contains(1))   // element => Boolean
    println(seq contains "dfg")
    var arr= new Array[Int](4)
    seq.copyToArray(arr,1,2)
    arr.foreach(println)
    println(arr.size)

    //Methods
    println(seq.endsWith(Seq(2,1)))
    println(seq.head)
    println(seq.indexOf(1))
    println(seq.lastIndexOf(1))
    println(seq.reverse)
    //Adding
    seq=seq :+ 10
    println(seq)
    //merging
    val seq1= Seq("fgy","kiol","drf","sed")
    val merged = seq ++ seq1
    println(merged)
    // deleting : list is immutable so cannot be deleted
    //Sorting
    println(seq.sorted)
}
