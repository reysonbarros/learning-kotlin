fun main() {

    println("Welcome to Bytebank")

    val entity = "Reyson Barros"
    val account = 12100886
    var amount = 0.0
    amount += 200

    println("entity $entity")
    println("account $account")
    println("amount $amount")


    if(amount > 0.0){
        println("positive balance")
    }else if(amount == 0.0){
        println("neutral balance")
    }else{
        println("negative balance")
    }

    when{
        amount > 0.0 -> println("positive balance")
        amount == 0.0 -> println("neutral balance")
        else -> println("negative balance")
    }

}