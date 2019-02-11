object fuctorial  extends App{
  var worker = new factorial
  println(worker.factorial(4))
}

class factorial {

  def factorial(num : Int) : Int = {
    if(num == 0) 1
    else num * factorial(num - 1)

  }

}
