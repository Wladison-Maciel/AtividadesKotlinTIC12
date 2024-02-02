fun calcularFatorial(numero: Int): Long {
    var resultado: Long = 1

    for (i in 1..numero) {
        resultado *= i
    }

    return resultado
}

fun main() {
    print("Digite um número para calcular o fatorial: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero >= 0) {
        val fatorial = calcularFatorial(numero)
        println("O fatorial de $numero é: $fatorial")
    } else {
        println("Por favor, digite um número não negativo.")
    }
}
