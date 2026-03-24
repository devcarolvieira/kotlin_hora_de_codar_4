//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Compras

    var listaDeCompras = mutableListOf<String>("Banana", "Maçã", "Uva", "Laranja", "Manga", "Morango", "Kiwi")

    println("Lista de compras para hoje: $listaDeCompras")

    do{
    println("Digite o nome da fruta para tirá-la da lista: ")
    var fruta = readln().lowercase().replaceFirstChar { it.uppercase() }

    if (listaDeCompras.contains(fruta)) {
        listaDeCompras.remove(fruta)
        println("$fruta foi retirada da lista")
    } else {
        println("Fruta indisponível no nosso mercado")
    }
    }while (listaDeCompras.isNotEmpty())

    println("Lista de compras finalizada.")
}