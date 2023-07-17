import platform.posix.double_t
import platform.windows.JOB_OBJECT_POST_AT_END_OF_JOB

fun main() {

    println("Bem vindo ao Bytebank!")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.saldo = 200.0


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 300.0


    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)


    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println(contaJoao.titular)

    contaAlex.saldo += 50.0





}




class Conta {

    var titular = ""
    var numero = 0
    var saldo = 0.0

    var cpf = ""
    var nomePai =""
    var nomeMae = ""
}

fun deposita(conta:Conta, valor:Double){
    conta.saldo += valor
}