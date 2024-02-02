import java.util.Scanner;
import kotlin.math.sqrt
fun main(){
    val scanner = Scanner(System.`in`)
    var numero:Double = 0.0
    try {
        println("Digite um número: ")
        numero = scanner.nextDouble()
        if (numero <= 0){
            throw ArithmeticException()
        }
        else {
            var res:Double = sqrt(numero)
            println("A raiz quadrada desse número é: ${res}")
        }
    }catch (e: ArithmeticException){
        println("Erro, o número não pode ser menor ou igual a zero")
    }
}