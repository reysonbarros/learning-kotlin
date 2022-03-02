fun main() {

    println("Welcome to Bytebank")

    val entity = "Entity"
    val account = 12100886
    var amount = 0.0
    amount += 200

    printAccountInfo(entity,account,amount)
    testConditions(amount)
    testLoops(entity,account,amount)


}

fun printAccountInfo(entity: String, account: Int, amount: Double){
    println("entity $entity")
    println("account $account")
    println("amount $amount")
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