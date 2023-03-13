package Exercises
import scala.collection.immutable._
object CollectionSet{
    def main(arg: Array[String])={
        //SET PROPERTIES
        val set1 = Set("Cricket", "Football", "Hocky", "Golf")
        println(set1)
        val set2 = Set()
        println(set2)
        val set3: Set[Int]= Set(1, 3, 2, 4)
        println(set3)
        val set4 = Set(1, 2, 4, "M")
        println(set4)
        val set5 = Set(2,4,"gh","1")
        println(set5)

        println(set1.head) // first element of set
        println(set1.tail) // all elements except first
        println(set1.last) // last element
        println(set1.isEmpty)
        println(set2.isEmpty)
        println(set1.max) // Hocky
        println(set3.max)
        println(set1("Hocky")) // checks whether the element is present or not => true
        println(set3(0)) // false
        println(set1.min) // Cricket
        println(set2.size) // number of sizes
        println(set3.sum) // sum of elements => not suitable for string elements

        val mergeSet = set1 ++ set3
        println(mergeSet)
        println(mergeSet.contains("Golf"))
        println(mergeSet("Golf"))

        //Adding element into set
        println(set1 + "mango" + "orange")
        println(set3+1) //doesn't allow duplicacy and ignores it
        println(set4 + 5)
        //removing element
        println(set1 - "mango")  // Doesn't show any error if specified element is not present
        println(set1 - "Golf")

        //iterating through set
        for(element<-set1) print(element + " ")
        println()
        set1.foreach{
            (element: Any) => print(element + " ")
        }
        println()

        //set operations
        println(s"set1 = $set1")
        println(s"set2 = $set2")
        println(s"set3 = $set3")
        println(s"set4 = $set4")
        println(s"set5 = $set5")

        // Intersection
        println(set4.intersect(set5))
        println(set4 & set5)
        // Union
        println(set4.union(set5))
        println(set4 | set5)

        //Sorting set
        val s1 = SortedSet(5,8,1,2,9,6,4,7,2)
        println(s1)
        for(x<-s1) println(x)

        //HASHSET PROPERTIES
        val h1 = HashSet(1,0,8,6,2,6,7)
        println(h1)
        for(x<- h1) print(x+ " ");println()

        //BITSET PROPERTIES        //non negative integers
        val b1 = BitSet(8, 4, 73, 6, 56, 23)
        println(b1)
        try{
            val b2 = BitSet(8,-4,73,6,56,23) //error
            println(b2)
        }
        catch{
            case e=>println("Error occurred => "+e)
        }
        finally{
            println("Error handled")
        }

        //LISTSET PR0PERTIES               // ORDERED
        var lst1 : ListSet[String]= ListSet.empty
        var lst2 : ListSet[String]= ListSet.empty
        println(lst1,lst2)
        lst1+="capital"
        lst2+="mango"
        println(lst1,lst2)
        println(lst1.head)
        lst1 += "city"
        lst2 += "orange"
        println(lst1, lst2)
        println(lst1.head)
    }
}
