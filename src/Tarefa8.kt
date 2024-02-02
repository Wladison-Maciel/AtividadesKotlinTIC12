fun calcularPosicaoFibonacci(numero: Int): Int {
    var a = 1
    var b = 1
    var posicao = 2 // Começa a partir da terceira posição, pois já temos 1 e 1 nas duas primeiras posições

    while (b < numero) {
        val temp = b
        b += a
        a = temp
        posicao++
    }

    return if (b == numero) posicao else -1
}

fun main() {
    try {
        print("Digite um número maior que 2 para encontrar na sequência de Fibonacci: ")
        val numero = readLine()!!.toInt()

        if (numero <= 2) {
            println("Por favor, digite um número maior que 2.")
        } else {
            val posicao = calcularPosicaoFibonacci(numero)
            if (posicao != -1) {
                println("Entrada: $numero Posição: $posicao")
            } else {
                println("O número $numero não está na sequência de Fibonacci.")
            }
        }
    } catch (e: NumberFormatException) {
        println("Por favor, digite um número válido.")
    }
}
