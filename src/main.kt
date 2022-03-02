fun main() {

    println("Welcome to Bytebank")

    val accountJohn = Account()
    accountJohn.owner = "John Doe"
    accountJohn.number = 1001
    accountJohn.balance = 300.0

    val accountMaria = Account()
    accountMaria.owner = "Maria Doe"
    accountMaria.number = 1002
    accountMaria.balance = 450.0

    printAccountInfo(accountJohn)
    accountJohn.deposit(15.0)
    accountJohn.withdraw(80.0)
    accountJohn.withdraw(800.0)
    println("balance ${accountJohn.balance}")
    println()

    printAccountInfo(accountMaria)
    accountMaria.deposit(60.0)
    accountMaria.withdraw(55.0)
    accountMaria.withdraw(900.0)
    println("balance ${accountMaria.balance}")



}

fun printAccountInfo(account: Account){
    println("owner ${account.owner}")
    println("account number ${account.number}")
    println("balance ${account.balance}")
    println()
}

fun testConditions(amount: Double){
    if (amount > 0.0) {
        println("positive balance")
    } else if (amount == 0.0) {
        println("neutral balance")
    } else {
        println("negative balance")
    }

    when {
        amount > 0.0 -> println("positive balance")
        amount == 0.0 -> println("neutral balance")
        else -> println("negative balance")
    }
}

fun testLoops(entity: String, account: Int, amount: Double){
    for(i in 1..5){
        println("entity $entity$i")
        println("account ${account+i}")
        println("amount ${amount+i}")
    }

    println("-------------------")

    for(i in 5 downTo 1){
        println("entity $entity$i")
        println("account ${account+i}")
        println("amount ${amount+i}")
    }

    println("-------------------")

    for(i in 5 downTo 1 step 2){
        println("entity $entity$i")
        println("account ${account+i}")
        println("amount ${amount+i}")
    }

    println("-------------------")
    var contador = 0
    while (contador < 5){
        println("entity $entity$contador")
        println("account ${account+contador}")
        println("amount ${amount+contador}")
        contador++
    }
}

fun testCopyAndReference(){
    var balance1 = 10.0
    var balance2 = balance1
    balance2 = 250.0
    println("balance1 $balance1")
    println("balance2 $balance2")

    val account1 = Account()
    account1.owner = "Test1"
    val account2 = account1
    account2.owner = "Test2"
    println("account1 ${account1.owner}")
    println("account2 ${account2.owner}")
}

class Account{
    var owner = ""
    var number = 1000
    var balance = 0.0

    fun deposit(value: Double){
        println("After deposit money... $value")
        if(value > 0){
            balance += value
        }
    }

    fun withdraw(value: Double){
        println("After withdraw money... $value")
        if(value <= balance){
            balance -= value
        }
    }

}
