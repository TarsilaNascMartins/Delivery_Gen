package funcioDelivery

open class Cardapio {

    var listaDeCompras = mutableListOf<String>()

    var listaDePagamentoP = mutableSetOf<Double>()

    var listaDeAdicionais = mutableListOf<String>()

    fun fazPedido(mensagem: String) {

        if (mensagem == "sim" || mensagem == "SIM" || mensagem == "Sim") {

            do {

                println("\n* * *CARDÁPIO PIZZA SALGADA * * *")
                println(
                    "Por favor, escolha entre nossas opções no cardápio: " +
                            "\n1 - Calabresa R$32,99\n" +
                            "2 - Portuguesa R$35,99\n" +
                            "3 - Marguerita R$29,99\n" +
                            "4 - Frango com catupiry R$39,99\n" +
                            "5 - Mussarela R$19,99\n" +
                            "6 - Quatro queijos R$24,99\n"
                )

                println(
                    "\n* * *CARDÁPIO PIZZA DOCE * * * " +
                            "Por favor, escolha entre nossas opções no cardápio: " +
                            "\n7 - Brigadeiro R$44,99\n" +
                            "8 - Chocolate R$39,99\n" +
                            "9 - Banana R$42,99\n" +
                            "10 - Romeu e Julieta R$54,99\n"
                )

                val opc2 = readLine()!!.toInt()

                when (opc2) {
                    1 -> {
                        println("Você escolheu a pizza de Calabresa")
                        listaDeCompras.add("Calabresa")
                        listaDePagamentoP.add(32.99)

                    }
                    2 -> {
                        println("Você escolheu a pizza de Portuguesa")
                        listaDeCompras.add("Portuguesa")
                        listaDePagamentoP.add(35.99)
                    }
                    3 -> {
                        println("Você escolheu a pizza de Marguerita")
                        listaDeCompras.add("Marguerita")
                        listaDePagamentoP.add(29.99)
                    }
                    4 -> {
                        println("Você escolheu a pizza de Frango com catupiry ")
                        listaDeCompras.add("Catupiry")
                        listaDePagamentoP.add(39.99)
                    }
                    5 -> {
                        println("Você escolheu a pizza de Mussarela")
                        listaDeCompras.add("Mussarela")
                        listaDePagamentoP.add(19.99)
                    }
                    6 -> {
                        println("Você escolheu a pizza de Quatro queijos")
                        listaDeCompras.add("Quatro Queijos")
                        listaDePagamentoP.add(24.99)
                    }

                    7 -> {
                        println("Você escolheu a pizza de Brigadeiro")
                        listaDeCompras.add("Brigadeiro")
                        listaDePagamentoP.add(44.99)
                    }
                    8 -> {
                        println("Você escolheu a pizza de Chocolate")
                        listaDeCompras.add("Chocolate")
                        listaDePagamentoP.add(39.99)
                    }
                    9 -> {
                        println("Você escolheu a pizza de Banana")
                        listaDeCompras.add("Banana")
                        listaDePagamentoP.add(42.99)
                    }
                    10 -> {
                        println("Você escolheu a pizza de Romeu e Julieta")
                        listaDeCompras.add("Romeu e Julieta")
                        listaDePagamentoP.add(54.99)
                    }
                }

            } while (opc2 <= 0 || opc2 >= 11)

            println("Deseja incluir borda?")
            val opc1 = readLine()!!



            if (opc1 == "sim" || opc1 == "SIM" || opc1 == "Sim") {
                do {


                    println(
                        "Escolha o sabor: " +
                                "\n1 - Catupiry R$5,99\n" +
                                "\n2 - Cheddar R$8,99\n" +
                                "\n3 - Chocolate R$9,99\n" +
                                "\n4 - Doce de leite R$9,99\n"
                    )
                    val borda = readLine()!!.toInt()

                    if (borda <= 0 || borda >= 5)
                        println("Opçâo nâo existe no Cardapio!")

                    when (borda) {

                        1 -> {
                            println("Ok, iremos adicionar Catupiry na sua borda!")
                            listaDeAdicionais.add("Catupiry")
                            listaDePagamentoP.add(5.99)
                        }
                        2 -> {
                            println("Ok, iremos adicionar Cheddar na sua borda")
                            listaDeAdicionais.add("Cheddar")
                            listaDePagamentoP.add(8.99)
                        }
                        3 -> {
                            println("Ok, iremos adicionar Chocolate na sua borda")
                            listaDeAdicionais.add("Chocolate")
                            listaDePagamentoP.add(9.99)
                        }
                        4 -> {
                            println("Ok, iremos adicionar Doce de leite na sua borda")
                            listaDeAdicionais.add("Doce de leite")
                            listaDePagamentoP.add(9.99)
                        }
                    }
                } while (borda <= 0 || borda >= 5)

            }
        } else {
            println("Ok!")
        }

    }

    fun listar () {
            println("\n* * * SEU CARRINHO * * *")
            println("Por favor confira seu carrinho de compras:" +
                "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais") }

    fun removeitem(){
            println("\n* * * REMOVER ITENS * * *")
            println("Veja os itens disponíveis na sua cesta:" +
                "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais")

            println("Por favor digite o item que deseja remover (1 - Pizza ou 2 - Borda): ")
            val itemr = readLine()!!.toInt()

    if(itemr == 1){
            println("Por favor, digite o item a ser removido")
            val itemrr = readLine()!!

            listaDeCompras.remove(itemrr)
            println("Item $itemrr removido com sucesso!")
            println(listaDeCompras)
            println(listaDeAdicionais)
    } else {
            println("Por favor, digite o item a ser removido")
            val itemA= readLine()!!
            listaDeAdicionais.remove(itemA)

            println("Item $itemA removido com sucesso!")
            println(listaDeCompras)
            println(listaDeAdicionais)
        }
    }
    fun feedback() {
            println("Por favor, avalie nossos serviços dando uma nota de 0/5 estrelas \uD83C\uDF1F: ")
            val feedbackmsg = readLine()!!.toInt()
            var recebe = ""

        if (feedbackmsg < 4) {
            println("Deseja enviar mensagem? sim/não")
            recebe = readLine()!!

     }
            if (recebe == "sim" || recebe == "SIM") {
                println("Como podemos melhorar?")
                readLine()!!
                println("Obrigado pelo Feedback!")


            } else {
                println("Ok! Qualquer coisa só entrar em contato.")
            }
        }
    open fun mostrar (){
        println("\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais")
    }
}