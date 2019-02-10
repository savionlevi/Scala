package Bank

object BankAccount extends App {
  var myAccount = new BankAccount(300)
  println("current balance: "+myAccount.balance)
  myAccount.deposit(50)
  println("current balance: "+myAccount.balance)
  myAccount.withdraw(100)
  println("current balance: "+myAccount.balance)
}

class BankAccount(var balance : Double) {
  def deposit(amount : Double) = {
    balance += amount
  }

  def withdraw(amount : Double) = {
    balance -= amount
  }



}
