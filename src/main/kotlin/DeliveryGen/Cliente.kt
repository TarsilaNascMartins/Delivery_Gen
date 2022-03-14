package DeliveryGen

class Cliente( nome: String, telefone: String, var email: String, var senha: String, var endereco: String):
          Pessoa(" "," ") {

         fun cadastroCliente(valor1 : String, valor2: String,valor3 : String,valor4 : String,valor5 : String ) {
            nome = valor1
            telefone = valor2
            email= valor3
            endereco = valor4
            senha = valor5


            println("\nCadastro efetuado com sucesso!\uD83C\uDFE9" +
                    "\nNome: $nome" +
                    "\nTelefone: $telefone" +
                    "\nEmail: $email" +
                    "\nEndereço: $endereco" +
                    "\nSenha: $senha\n")
        }



        fun verifiCadastro(): Boolean{
            return email == "" ||  senha.isEmpty() ||  senha.length < 5
        }

        fun trocarlogin(novologin: String){
            if(novologin.isEmpty()){
                println("Valor Inválido")
            }else{
                email = novologin
                println("O Login foi alterado!")
            }
        }

        fun trocarSenha(novoSenha: String){
            if(novoSenha.isEmpty()){
                println("Valor Inválido")

            }else if(novoSenha.length < 5){
                println("A senha precisa ser no miníno 5 digitos!")
            }else {
                println("Foi alterado com sucesso!")
            }
        }

        fun verificarNome(): Boolean{
            return nome != ""
        }

        fun verificarEmail(): Boolean{
            return email != ""
        }

        fun verificarTamanhoSenha(): Boolean{
            return senha.length in 5..20
        }
        fun feedback() {

            println("Por favor, avalie nossos serviços dando uma nota de 0/5 estrelas \uD83C\uDF1F: ")
            val feedback = readLine()!!.toInt()

            if(feedback < 4){

                println("Gostaríamos de saber, como podemos melhorar?")
                var feedbackcoment = readLine()!!
                println("Obrigada pelo feedback!")

            }else{
                println("Obrigada pelo feedback!")
            }

        }
}

