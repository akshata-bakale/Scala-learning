package Exercises

object CollectionMap extends App{
    val map = Map(("A","Apple"),("B","Ball"))
    val map2 = Map("a"->"apple","b"->"ball")
    val map3= Map.empty[String,String]
    println(map,map2,map3)

    //adding
    println(map + ("C"->"cat"))
    //removing
    println(map - "B")
    println(map - "b")  // no error
    //accessing
    println(map("B"))   // Ball
//    println(map("b"))   // Error

    //iterating
    for((x,y)<-map)  println(s"key = $x and value = $y")
    println(map.keys)
    println(map.values)

    // contains
    println(map contains "A")

    //updating
    val newmap = scala.collection.mutable.Map("a"->"apple","b"->"ball")
    newmap("b") = "Bangaluru"
    println(newmap)
    newmap+=("c"->"cat","d"->"dog")
    println(newmap)
    newmap-=("a")
    println(newmap)
}
