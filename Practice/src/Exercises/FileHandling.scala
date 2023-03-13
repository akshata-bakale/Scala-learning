package Exercises

import java.io.{File, FileWriter, PrintWriter}
import scala.io.Source
import scala.sys.process._

object FileHandling{
    def main(arg: Array[String]): Unit = {
        val fname = "src/Exercises/demo.txt"
        val cwd = "pwd".!!
        println(cwd)
        /*
        val file_Object = new File(fname)
        val print_Writer = new PrintWriter(file_Object)
        print_Writer.write("this is new scalar file handling\n")
        print_Writer.write("this is second line of scalar file handling\n")
        print_Writer.close()
         */


        val fSource = Source.fromFile(fname)
        var string =""
        while (fSource.hasNext) {
            string+=fSource.next
        }
        println(string)
        fSource.close()

        val fw = new FileWriter(fname,true)
        fw.write("This is appended line\n")
        fw.close()
        val fSource1 = Source.fromFile(fname)
        for(line<-fSource1.getLines)
            println(line)
    }

}
