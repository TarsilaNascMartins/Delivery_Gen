package DeliveryGen

class Empreendedor(nome: String, telefone: String) : Pessoa(nome, telefone) {

    var cnpj = ""

  constructor(nome: String, telefone: String, cnpj: String) : this(nome, telefone) {
    this.nome = nome
    this.telefone = telefone
    this.cnpj = cnpj

}    fun feedback() {

              println("Por favor, avalie nossos serviços dando uma nota de 0/5 estrelas \uD83C\uDF1F: ")
              val feedback = readLine()!!.toInt()

          if(feedback < 4){

              println("Gostaríamos de saber, como podemos melhorar?")
              var feedbackcoment = readLine()!!
          }

      }

     fun cadastroEmp(valor1 : String,telefone : String, cnpj: String) {
        nome = valor1
        println("\nCadastro efetuado com sucesso!\ud83c\udfe9 " +
                "\nNome: $nome" +
                "\nTelefone: $telefone:" +
                "\nCNPJ: $cnpj" +
                "\n")
 
    }









    }
    fun fazerComida(){



    }

















