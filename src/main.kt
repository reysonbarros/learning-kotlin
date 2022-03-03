fun main() {

    println("Welcome to Bytebank")
    println()

    val accountJohn = Account(number = 1001, owner = "John Doe")
    val accountMaria = Account( owner = "Maria Doe", number = 1002)

    println("Balance Account - John")
    println("Initial balance ${accountJohn.balance}")
    accountJohn.deposit(100.0)
    accountJohn.withdraw(20.0)
    if (accountJohn.transfer(30.0, accountMaria)) {
        println("Transfer was completed successfully")
    } else {
        println("Failure during transfer. Try again!")
    }
    println()

    println("Balance Account - Maria")
    println("Initial balance ${accountMaria.balance}")
    accountMaria.deposit(300.0)
    accountMaria.withdraw(20.0)
    if (accountMaria.transfer(10.0, accountJohn)) {
        println("Transfer was completed successfully")
    } else {
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

class Account(
    var owner: String,
    val number: Int
    ){
    var balance = 0.0
        private set

    fun deposit(value: Double){
        println("After deposit $value")
        if (value > 0) {
            balance += value
        }
    }

    fun withdraw(value: Double){
        println("After withdraw $value")
        if (value <= balance) {
            balance -= value
        }
    }

    fun transfer(value: Double, destinationAccount: Account): Boolean{
        println("After transfer $value to ${destinationAccount.owner}")
        if (value <= balance) {
            balance -= value
            destinationAccount.balance += value
            return true
        }
        return false
    }

}
