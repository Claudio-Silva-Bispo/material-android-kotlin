
fun main(){
    println("Digite a temperatura:");
    var temperatura = readLine()!!.toInt();

    println("Selecione 1 para Celsius, 2 para Fahrenheit ou 3 para Kelvin");
    var opcao = readLine()!!.toInt();

    // base
    // var Celsius Double = 25.0
    // var Fahrenheit Double = Celsius * 9/5 + 32
    // var kelvin Double = Celsius + 273.15

    // Analisar qual a opcao foi selecionada e com base nisso converter a temperatura para o valor escolhido

    fun resultado(temperatura: Int, opcao: Int) {
    if(opcao == 1) {
        println("A temperatura em Celsius é: $temperatura")
    }else if(opcao == 2){
        println("A temperatura em Fahrenheit é: ${(temperatura * 9/5) + 32}")
    }else{
        println("A temperatura em Kelvin é: ${temperatura + 273.15}")
    }


    }

    println(resultado(temperatura, opcao))
}

// Para executar, precisa inserir a pasta e arquivo no terminal.