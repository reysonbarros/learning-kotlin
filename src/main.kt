fun main() {

    println("Welcome to Bytebank")
    println()

    val accountJohn = Account()
    accountJohn.owner = "John Doe"
    accountJohn.number = 1001
    accountJohn.balance = 100.0

    val accountMaria = Account()
    accountMaria.owner = "Maria Doe"
    accountMaria.number = 1002
    accountMaria.balance = 200.0

    println("Balance Account - John")
    println("Initial balance ${accountJohn.balance}")
    accountJohn.deposit(10.0)
    accountJohn.withdraw(20.0)
    if(accountJohn.transfer(30.0, accountMaria)){
        println("Transfer was completed successfully")
    }else{
        println("Failure during transfer. Try again!")
    }
    println()

    println("Balance Account - Maria")
    println("Initial balance ${accountMaria.balance}")
    accountMaria.deposit(30.0)
    accountMaria.withdraw(20.0)
    if(accountMaria.transfer(10.0, accountJohn)){
        println("Transfer was completed successfully")
    }else{
        println("Failure during transfer. Try again!")
    }
    println()

    printAccountInfo(accountJohn)
    printAccountInfo(accountMaria)

}

fun printAccountInfo(account: Account){
    println("owner ${account.owner}")
    println("account number ${account.number}")
    println("balance ${account.balance}")
    println()
}

class Account{
    var owner = ""
    var number = 1000
    var balance = 0.0

    fun deposit(value: Double){
        println("After deposit $value")
        if(value > 0){
            balance += value
        }
    }

    fun withdraw(value: Double){
        println("After withdraw $value")
        if(value <= balance){
            balance -= value
        }
    }

    fun transfer(value: Double, destinationAccount: Account): Boolean{
        println("After transfer $value to ${destinationAccount.owner}")
        if(value <= balance){
            balance -= value
            destinationAccount.balance += value
            return true
        }
        return false
    }

}
