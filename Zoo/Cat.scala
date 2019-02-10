package Zoo

object Cat extends App {
  var claw = new Cat
  claw.color = "black"
  claw.age = 3
  claw.isCarnivor = true
  println(claw.age , claw.color)
}

class Cat extends Animal {

}
