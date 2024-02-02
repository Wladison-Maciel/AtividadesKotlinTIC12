import java.util.Scanner
import kotlin.math.sqrt

fun main(){

    val scanner = Scanner(System.`in`)

    var a:Double = 0.0
    var b:Double = 0.0
    var c:Double = 0.0
    var delta:Double = 0.0

    println("Digite o A da equação: ")
    a = scanner.nextDouble()
    println("Digite o B da equação: ")
    b = scanner.nextDouble()
    println("Digite o C da equação: ")
    c = scanner.nextDouble()
    delta = (b*b) + (-4*a*c)
    var expressaoP = ((-b) + sqrt(delta))/(2*a)
    var expressaoN = ((-b) - sqrt(delta))/(2*a)
    println("O delta é: ${delta}")

    try {
        if(delta.toInt() < 0){
            throw Exception()
        }
       else if(delta.toInt() == 0){
            println("O resultado da equação de 2° grau com Delta = 0 é: ${expressaoP.toInt()}")
        }
        else {
            println("O resultado da equação de 2° grau com Delta > 0 é x¹: ${expressaoP.toInt()}")
            println("O resultado da equação de 2° grau com Delta > 0 é x²: ${expressaoN.toInt()}")
       }

    }catch(e: Exception){
        println("Não existe raiz negativa")
    }

}

