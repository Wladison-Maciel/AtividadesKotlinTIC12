import java.util.Scanner

fun main(){
    var numerador:Int = 0
    var denomiador:Int = 0
    val scanner = Scanner(System.`in`)
    numerador = scanner.nextInt()
    denomiador = scanner.nextInt()
    var resultado:Int = numerador/denomiador
    try {
        println("O resultado da divisão é ${resultado}")
        if(denomiador == 0){
            throw ArithmeticException()
        }
    } catch (e: ArithmeticException){
        println("Não é possível fazer a divisão por 0 ou menor")
    }
}