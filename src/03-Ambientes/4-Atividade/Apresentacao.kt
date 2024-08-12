
fun main() {

    //Declaração de variável
    var idade = 42      //Idade do professor
    var altura = 1.67f  //Altura do professor (usando o 'f' para indicar que é um float)
    var inicial  = 'V'  // Inicial do nome do professor 

    // Impressão das informações do indivíduo usando interploação de strings 
    println("Minha inicial é $inicial, tenho $idade anos e minha $altura é %.2f".format(altura))

}