//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Planetas

    var planetas = mutableListOf<String>("TERRA", "MARTE", "PLUTÃO", "VÊNUS", "JÚPITER", "SATURNO")

    println("Digite o nome de um planeta: ")
    var planeta = readln().uppercase()

    if(planetas.contains(planeta)){
    println("Este planeta consta na lista!")
    }else{
    println("Este planeta não consta na lista!")
    }
}