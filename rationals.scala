package example

import scala.collection.mutable.ArrayBuffer

object rationals extends App {
  val myRational = new Rational(3, 1)
  myRational.numer
  myRational.denom
  myRational.printRational()
  println(myRational.neg())
  println("Subtracting: " + myRational.subtract())
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  println("summing")
  println(z.+())
  println(x.less(y))
  println("winner: " +x.max())
  println("winner: " +y.max())
  println("winner: " +z.max())

  var rationalsBuffer = ArrayBuffer[Rational]()
  rationalsBuffer += myRational
  rationalsBuffer.insert(1, myRational)
  rationalsBuffer.remove(1)
  rationalsBuffer += (myRational, myRational)
  rationalsBuffer.trimEnd(1)

  for(rational <- rationalsBuffer) {
    println("printing rationals kind sir! : "+rational.toStringX())
  }

}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y


  def +() : Integer = {
    return this.x + this.y
  }

  def printRational() = {
    println("x: " + this.x)
    println("y: "  + this.y)
  }

  def neg() : Integer =  {
    return this.x * (-1)
  }

  def subtract() : Integer = {
    return this.x - this.y
  }


  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max() : Integer = {
    if (this.numer > this.denom)
      return this.numer
    else
    return this.denom
  }

  def toStringX() { println(this.numer +","+ this.denom) }
}

