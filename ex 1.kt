//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Estudantes
    var estudantes = mutableListOf("Rebecca", "Matilda", "Olivia", "Fernando", "Natália")
    var resposta: String

    do {
    println("Quer adicionar um nome na lista? (S para sim ou PARE para sair): ")
    resposta = readln().uppercase()

    if(resposta == "S") {
    println("Digite o nome do estudante:")
    val novoNome = readln()

    if (novoNome.isNotBlank()) {
    estudantes.add(novoNome)
    println("$novoNome foi adicionado com sucesso.")
     }
    }else if(resposta == "PARE"){
    println("Quantidade total: ${estudantes.size}")
    println(estudantes)
    }
    }while(resposta=="S")
}
