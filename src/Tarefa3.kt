import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    var confirmacao:Int = 0
    var nota1: Double = 0.0
    var nota2: Double = 0.0
    var nota3: Double = 0.0
    var nota4: Double = 0.0
    var nota5: Double = 0.0
    var nota6: Double = 0.0
    while (confirmacao == 0) {
        try {
            println("Digite sua 1° nota: ")
            nota1 = scanner.nextDouble()
            if (nota1 > 10.0 || nota1 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    while (confirmacao == 1) {
        try {
            println("Digite sua 2° nota: ")
            nota2 = scanner.nextDouble()
            if (nota2 > 10.0 || nota2 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    while (confirmacao == 2) {
        try {
            println("Digite sua 3° nota: ")
            nota3 = scanner.nextDouble()
            if (nota3 > 10.0 || nota3 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    while (confirmacao == 3) {
        try {
            println("Digite sua 4° nota: ")
            nota4 = scanner.nextDouble()
            if (nota4 > 10.0 || nota4 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    while (confirmacao == 4) {
        try {
            println("Digite sua 5° nota: ")
            nota5 = scanner.nextDouble()
            if (nota5 > 10.0 || nota5 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    while (confirmacao == 5) {
        try {
            println("Digite sua 6° nota: ")
            nota6 = scanner.nextDouble()
            if (nota6 > 10.0 || nota6 < 0) {
                throw Exception()
            } else {
                confirmacao++
            }
        } catch (e: Exception) {
            println("Nota inválida, digite novamente sua nota!")
        }
    }
    var media:Double = (nota1+nota2+nota3+nota4+nota5+nota6)/6
    var converterMedia:String = String.format("%.1f", media);
    println("Sua nota final é de: ${converterMedia}")
}