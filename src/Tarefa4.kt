import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    var salarioBruto:Double = 0.0
    var salarioLiquido:Double = 0.0
    var desconto:Double = 0.0
    var confirmacao:Int = 0
    while (confirmacao == 0){
        try {
            println("Digite seu salário bruto: ")
            salarioBruto = scanner.nextDouble()

            // Falta terminar

            if(salarioBruto < 1412.0){
                throw Exception()
            }
            else if(salarioBruto < 3000){
                desconto = salarioBruto * (4/100)
                salarioLiquido = salarioBruto - desconto
                println("Houve um desconto de 4%: ${salarioLiquido}")
                confirmacao ++
            }
            else if (salarioBruto > 3000){
                desconto = salarioBruto * (7.5/100)
                salarioLiquido = salarioBruto - desconto
                println("Houve um desconto de 7,5%: ${salarioLiquido}")
                confirmacao ++
            }
            else{
                desconto = salarioBruto * (11/100)
                salarioLiquido = salarioBruto - desconto
                println("Houve um desconto de 11%: ${salarioLiquido}")
                confirmacao ++
            }
        }catch (e: Exception){
            println("Erro, não é permitido salário menor do que R$1412,00")
        }
        catch (e:Exception){
            println("Erro, digite somente números")
        }
    }
}