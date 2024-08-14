// Criar um input para o usuário inserir três notas e depois tirar a média

fun main() {

    println("Digite a nota da primeira avaliação:");
    var nota1 = readLine()!!.toDouble();

    println("Digite a nota da segunda avaliação:");
    var nota2 = readLine()!!.toDouble();

    println("Digite a nota da terceira avaliação:");
    var nota3 = readLine()!!.toDouble();

    var media = (nota1 + nota2 + nota3) / 3;

    println("Primeira nota é: $nota1, Segunda nota é: $nota2, Terceira nota é $nota3 e média final é $media" )
}

// Não vai rodar direto se eu der play, pois preciso rodar no terminal.

// Só inserir a linha que aparece no campo saída:
/*
cd "/Users/claudiobispo/Documents/Kotlin/mad-android/src/05 - Media/" && kotlinc desafio_input.kt -include-runtime -d desafio_input.jar && java -jar desafio_input.jar
*/