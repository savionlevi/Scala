import  scala.collection.mutable.Set

object singletonSet extends App {

  var firstSingleton = new mySingletonSet()
  firstSingleton.createSingletonSet(5)

  var singleton1 = Set(1)
  var singleton2 = Set(2)
  var union = firstSingleton.union(singleton1 , singleton2)
  println("first element: "+union.head)
  println("second element: " +union.tail)

  var singleton3 = Set(2,3)
  var singleton4 = Set(3,4)
  var intersectSet = firstSingleton.intersect(singleton3, singleton4)
  println("intersect set : "+intersectSet.head)
  println("intersect set : "+intersectSet.tail)

  firstSingleton.printSet(firstSingleton.diff(singleton3, singleton4))
}

class mySingletonSet {

  def createSingletonSet(number : Int) : Set[Int] = {
    val singletonSet : Set[Int]  = Set(number)
    println(singletonSet.head)

    return singletonSet
  }

  def union(firstSingleton : Set[Int] , secondSingleton : Set[Int]) : Set[Int] = {
    val unionSet = Set(firstSingleton.head , secondSingleton.head)

    return unionSet
  }

  def intersect(firstSingleton : Set[Int] , secondSingleton : Set[Int]) : Set[Int] = {

    val intersectSet = firstSingleton.intersect(secondSingleton)
    return intersectSet
  }

  def diff(firstSingleton : Set[Int] , secondSingleton : Set[Int]) : Set[Int] = {
    println("printing your set kind sir ! ")
    var diffSet = firstSingleton ++ secondSingleton
    return diffSet
  }

  def printSet(mySet : Set[Int]) = {
    var myInt = 0;
    for(myInt <- mySet) {
      println(myInt)
    }
  }
}
