import platform.posix.double_t
import platform.windows.JOB_OBJECT_POST_AT_END_OF_JOB

fun main() {

    println("Bem vindo ao Bytebank!")

    val contaAlex = Conta("Alex", 1001)
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1001
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1002, titular = "Fran")
//    contaFran.titular = "Fran"
//    contaFran.numero = 1002
    contaFran.deposita(300.0)


    println("transfer conta fran p alex")

    if (contaFran.transfere(800.0, contaAlex)){
        println("tranf sucedida")
    }else{
        println("falha")
    }
}

class Conta (
    var titular: String,
    val numero: Int
) {

//    var titular = titular
//    var numero = numero
    var saldo = 0.0
        private set

    var cpf = ""
    var nomePai =""
    var nomeMae = ""

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita( valor:Double){
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double){

        if(this.saldo >= valor){
            saldo -= valor
//            return error(message = "Saldo insuficiente")
//        }else {
//            println("Valor sacado com sucesso")
        }

    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {

        if(this.saldo >= valor){
                saldo -= valor
                contaDestino.deposita(valor)
                    return true
                    }
                return false
        }

}