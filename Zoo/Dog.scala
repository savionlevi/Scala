package Zoo

object Dog  extends App {
    var lucky = new Dog
  lucky.isCarnivor = true
  lucky.age = 5
  lucky.color = "white"
  println(lucky.age)
  println(lucky.color)

  lucky.eat()
  lucky.bark()

}

class Dog extends Animal {
  def bark(): Unit = {
    println("woof ! ")
  }
}
