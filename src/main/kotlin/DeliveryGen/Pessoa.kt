package DeliveryGen

open class Pessoa(var nome:String, var telefone: String ) {

     init {
         if (nome.isEmpty() || telefone.isEmpty()) {
             throw Exception ("O usuário precisa de nome e telefone!")
         }
    }

        open  fun cadastro(s: String, s1: String, s2: String, s3: String, s4: String) {
                println ("Tipo de pessoa/ empresa, entregador,cliente  " +
                "Nome: $nome" +
                "Telefone: $telefone:")
    }


        open fun fazContato (desejaEnviarMsg : String) {

                println("Digite sua mensagem:")
                val desejaEnviarMsg = readLine()!!

       if(desejaEnviarMsg.isEmpty()){
                println("Não há mensagem no espaço. ")
       } else {
                println("Mensagem enviada com sucesso!")}

    }

       fun lista(){}

       fun fazPedido(mensagem: String) {}

}





