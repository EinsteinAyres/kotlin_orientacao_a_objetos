fun main() {
    println("Bem vindo ao Bytebank!")

    var i = 0
    while (i<5){
        var titular = "Alex $i";
    val numeroConta = 1000 + i;
    var saldo = i + 10.0;
//
//    saldo = 100.0 + 2.0
//    saldo += 200

    println("Titular: $titular") //dentro do print o "$" substitui a concatenação
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")
        println()
        i++
    }



//    for (i in 5 downTo 1){
//
//        if (i==4){
//           continue
//        }
//
//    var titular = "Alex $i";
//    val numeroConta = 1000 + i;
//    var saldo = i + 10.0;
////
////    saldo = 100.0 + 2.0
////    saldo += 200
//
//    println("Titular: $titular") //dentro do print o "$" substitui a concatenação
//    println("Número da conta: $numeroConta")
//    println("Saldo da conta: $saldo")
//        println()
//
//
//    println(i)}
//
////    testaCondicoes(saldo)


}

fun testaCondicoes(saldo:Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if(saldo == 0.0) {
        println("Conta é neutra")
    }else {
        println("Conta é negativa")
    }

    // Os códigos acima e abaixo são equivalentes

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

}