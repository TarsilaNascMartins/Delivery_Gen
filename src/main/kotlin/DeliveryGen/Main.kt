import funcioDelivery.Cardapio
import DeliveryGen.Cliente
import DeliveryGen.Empreendedor
import DeliveryGen.Entregador

fun main() {

    val cadEmpreendedor = Empreendedor(" ", " ")
    val cadCliente = Cliente("", "", "", "", "")
    val cadEntregador = Entregador(" ", " ", 0, " ", " ")
    val card = Cardapio()




    println("* * * * * DELIVERY GEN * * * * *")
    println("Cadastro de usuário" +
            "\nQual seu tipo de cadastro?" +
            "\n1-Empreendedor    2-Entregador     3-Cliente")

    val tipo = readLine()!!.toInt()

    do {
        when (tipo) {

            //Empreendedor
            1 -> {

                println("CADASTRO DA EMPRESA")
                print("Escreva seu nome:")
                val nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu cnpj:")
                val cnpj = readLine()!!

                cadEmpreendedor.cadastroEmp(nome, telefone, cnpj)
            }

            //Entregador
            2 -> {
                println("CADASTRO DO ENTREGADOR")
                print("Escreva seu nome:")
                val nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu endereço:")
                val endereco = readLine()!!
                print("Escreva seu CPF:")
                val cpf = readLine()!!
                print("Escreva sua idade:")
                val idade = readLine()!!.toInt()

                cadEntregador.cadastroEntregador(nome, telefone, endereco, cpf, idade)

            }

            //Cliente
            3 -> {
                println("CADASTRO DO CLIENTE")
                print("Escreva seu nome:")
                var nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu email:")
                val email = readLine()!!
                print("Escreva seu endereço:")
                val endereco = readLine()!!
                print("Escreva seu senha:")
                val senha = readLine()!!

                cadCliente.cadastroCliente(nome, telefone, email, endereco, senha)

            }
        }
        println(
            "Deseja terminar o Cadastro?\n" +
                    " 1-Sim/2-Não"
        )
        val continua = readLine()!!.toInt()
    } while (continua != 1)

    //Função pedido
    println("Deseja pedir?")
    val mensagem = readLine()!!
    card.fazPedido(mensagem)
    do {


        do {

            println("\n* * * MENU  * * *")
            println("1- Adicionar outra pizza")
            println("2- Remover produto do pedido")
            println("3- Listar os produtos do pedido")
            println("4- Finalizar pedido/Pagamento\n")

            print("Digite a função desejada\n")
            val opc: Int = readLine()!!.toInt()

            when (opc) {

                1 -> {
                    card.fazPedido(mensagem)
                }
                2 -> {
                    card.removeitem()
                }
                3 -> {
                    card.listar()
                }
                4 -> {
                    println("Pedido finalizado com sucesso!\n")

                    var result = 0.0

                    card.listaDePagamentoP.forEach{
                        result += it  }
                    println("Seu Carrinho:" +
                            "\nPizza: ${card.listaDeCompras} e de adicionais ${card.listaDeAdicionais}" +
                            "O valor total é de: $result" )


                }

            }
        } while (opc != 4)


        println("Escolha uma opção de pagamento:")
        println("1 - Dinheiro")
        println("2 - Cartão")
        println("3 - Voltar")

        println("Digite a opção desejada")
        val opcao = readLine()!!.toInt()

        if (opcao == 1){

            var result = 0.0
            card.listaDePagamentoP.forEach{
                result += it  }

do{
            println("Digite o valor do dinheiro que será dado:")
            val valorRecebido = readLine()!!.toDouble()

            if(valorRecebido == result){
                println("Ok! Não precisa de troco")

            }  else if (valorRecebido > result) {
                var troco = 0.0
                troco = valorRecebido - result
                println("O troco é: ${"%.2f".format(troco)}")
            } else {
                println("Valor inválido, é necessário um valor maior para o pagamento.")
            }
}while (valorRecebido < result)
        }

        if (opcao < 1 || opcao > 4) {
            println("\nOPÇÃO NÂO EXISTE!\n")
        }

    }while (opcao == 3)

    var result = 0.00
    card.listaDePagamentoP.forEach{
        result += it
    }



    println("O total da compra é $result")
    card.feedback()

    cadEntregador.recebePedido(dados = cadCliente)
    card.mostrar()

}