import scala.collection.mutable.ArrayBuffer

object ScalaArrays extends App {

  var nums = new Array[Int](3)

  nums(0) = 4
  println("num array: "+nums(0))

  var students = Array("Sara", "Tomy")

  var name = ""
  for( name <- students )
  println(name)

  students(0) = "Sue"


  for( name <- students )
    println(name)

  //Array Buffer, reminds the list from java

  val advancedStudents = ArrayBuffer[String]()
  advancedStudents.insert(0,"firemanSam")
  advancedStudents += "MarcusAurilius"
  advancedStudents ++= Array("susana", "Mishka")

  for( name <- advancedStudents ){
  println("advanced one: " +name)


    var multiTable = Array.ofDim[Int](5,5)
    for(i <- 0 to 4){
      for(j <- 0 to 4) {
        multiTable(i)(j) = i * j

      }
    }
    println("2 dim array progFun")
    for(i <- 0 to 4){
      for(j <- 0 to 4) {
        printf("%d : %d = %d\n", i, j, multiTable(i)(j))

      }
    }
  println("max : " + nums.max)
    println("min " + nums.min)
    println("sum : " + nums.sum)
  }
}
