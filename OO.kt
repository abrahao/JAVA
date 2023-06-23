// Classe que representa uma Pessoa
class Pessoa(val nome: String, val idade: Int) {
    // Método da classe Pessoa
    fun apresentar() {
        println("Olá, meu nome é $nome e eu tenho $idade anos.")
    }
}

// Classe que representa um Animal
class Animal(val nome: String, val especie: String) {
    // Método da classe Animal
    fun emitirSom() {
        when (especie) {
            "Cachorro" -> println("Au au!")
            "Gato" -> println("Miau!")
            else -> println("Barulho desconhecido")
        }
    }
}

fun main() {
    // Criando uma instância da classe Pessoa
    val pessoa = Pessoa("João", 30)
    pessoa.apresentar()

    // Criando uma instância da classe Animal
    val cachorro = Animal("Bolinha", "Cachorro")
    cachorro.emitirSom()

    val gato = Animal("Felix", "Gato")
    gato.emitirSom()
}
