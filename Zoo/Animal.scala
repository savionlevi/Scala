package Zoo

object Animal {
  var Zebra = new Animal("blackAndWhite", 4)
}

class Animal (var color : String = "Random" , var age : Int = 0) {
  var isCarnivor = false

  def eat() = {
    println("eating .. ")
  }

  def drink() = {
    println("drinking .. ")
  }
}
