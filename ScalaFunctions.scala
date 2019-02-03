object ScalaFunctions extends App{

  // def funcName (param1: dataType , param2: dataType) : returnType = {
  //body
  // return
  // }


  def sum(num1: Int, num2: Int) : Int = {
     num1+num2
  }

  def subtract(num1: Int, num2: Int) : Int = {
     num1-num2
  }

  def divide(num1: Int, num2: Int) : Int = {
     num1/num2
  }

  def multiply(num1: Int, num2: Int) : Int = {
     num1*num2
  }

  def sumOfNumbers(args: Int*) : Int = {
    var sum : Int = 0
    for(num <-args) {
      sum += num
    }
      sum
  }

  def factorial(num : BigInt) : BigInt = {
    if(num <=1)
      1
    else
      num * factorial(num-1)
  }

  println(sum(1,2))
  println(subtract(1,2))
  println(divide(1,2))
  println(multiply(1,2))
  println("Get sum " + sumOfNumbers(1,2,3,4,5,6))
  println("Factorial of 4= " + factorial(4))
}
