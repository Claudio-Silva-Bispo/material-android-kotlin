// Criar uma função de soma de dois quadrados

fun somaDosQuadrados(a: Int, b: Int): Int {

    val ValorA = a*a
    val ValorB = b*b 
    val Soma = ValorA + ValorB
    return Soma
}

// Rodar a função principal para eu saber se funcionou

fun main() {
    println(somaDosQuadrados(5, 3));
}