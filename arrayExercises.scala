import scala.collection.mutable.ArrayBuffer
import scala.math._
import java.io.Serializable

object arrayExercises extends App {

  var dummyArray = new Array[Int](10)
  var dummyArray2 = new Array[Int](10)

  var worker = new myArray()

  dummyArray = worker.setArrayWithRandomNumbers(dummyArray)
  worker.printArray(dummyArray)
  worker.printArray(dummyArray)

  worker.setArrayWithRandomNumbers(dummyArray2)
  worker.printArray(dummyArray2)
  var buffer = worker.returnPositiveValuesInArray(dummyArray2)
  worker.printArray(buffer)

  var douleArray = Array(1.0 , 2.4 , 3.0)
  println("average: "+worker.calcAverage(douleArray))

}

class myArray {

  def setArrayWithRandomNumbers(emptyArray : Array[Int]) : Array[Int] = {
    println("randoming: ")
    var i = 0
    while(i < 10) {
    var randomInt = (random * (11 - 1) -5 ).toInt // Random number between 1 and 10
    emptyArray(i) = randomInt
      i += 1
    }
    emptyArray
  }

  def printArray(dummyarray : Array[Int]) = {
    for(element <- dummyarray){
      print(element + ",")
    }
  }

  def printArray(dummyarray2 : ArrayBuffer[Int]) = {
    println("printing buffer: ")
    for(element <- dummyarray2){
      print(element + ",")
    }
  }

  // given array, return all positive values
  def returnPositiveValuesInArray(array : Array[Int]) : ArrayBuffer[Int] = {
    println("returning positive: ")
    var buffer = new ArrayBuffer[Int]
    for(element <- array) {
      if(element > 0) {
      buffer += element
      }
    }

    buffer
  }

  // calculate average of double array
  def calcAverage(array : Array[Double]) : Double = {
    var avg = 0.0
    for(element <- array) {
      avg += element
    }

    avg / array.length
  }
  //

}
