package projeto.main.curso.java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MenuTreino {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        int opcao;


        do {
            System.out.println("M E N U");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Listar nomes");
            System.out.println("4 - Buscar nome");
            System.out.println("5 - Editar Nome");
            System.out.println("6 - Sair");
            System.out.println("opcao:");

            while (!entrada.hasNextInt()) {
                System.out.println("digite um numero valido(1 a 4)");
                entrada.next();//descarta entrada errada
            }
            opcao = entrada.nextInt();
            entrada.nextLine(); // \n

            switch (opcao) {
                case 1:
                    System.out.println("--AREA DE CADASTRO DE NOME--");
                    System.out.println("Digite seu nome: ");
                    String nome = entrada.nextLine().trim();

                    if (nome.isEmpty()) {
                        System.out.println("nome vazio!");
                        break;
                    }

                    //verificar se o nome ja existe.
                    boolean jaCadastrado = false;
                    for(String n : nomes){
                        if(n.equalsIgnoreCase(nome)){
                            jaCadastrado = true;
                            break;
                        }
                    }
                    if (jaCadastrado) {
                        System.out.println("nome ja cadastrado");
                    } else {
                        nomes.add(nome);
                        System.out.println("nome cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("--AREA DE REMOCAO DE NOME--");
                    if (nomes.isEmpty()) {
                        System.out.println("nenhum nome foi cadastrado!");
                        break;
                    }
                    System.out.println("digite o nome que quer remover: ");
                    String nomeEscolhido = entrada.nextLine().trim();

                int removedor = -1;
                for (int i = 0; i < nomes.size(); i++) {
                    if (nomes.get(i).equalsIgnoreCase(nomeEscolhido)) {
                        removedor = i;
                        break;
                    }
                }
                if (removedor == -1) {
                    System.out.println("nome nao encontrado");
                } else {
                    nomes.remove(removedor);
                    System.out.println("nome removido com sucesso");
                }
                break;
                case 3:
                    System.out.println("--MOSTRAR NOMES CADASTRADOS--");
                    if (nomes.isEmpty()) {
                        System.out.println("nenhum nome cadastrado!");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {

                            System.out.printf("%d- %s%n", i + 1, nomes.get(i));

                            System.out.println("---------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-- BUSCAR NOME --");
                    if(nomes.isEmpty()){
                        System.out.println("nome nao cadastrado");
                        break;
                    }
                    System.out.println("digite o nome que quer buscar: ");
                    String termo =  entrada.nextLine().trim();
                    if(termo.isEmpty()){
                        System.out.println("busca sem nada, mostrando todos os nomes");
                        for (int i = 0; i <nomes.size(); i++) {
                            System.out.printf("%d- %s%n", i + 1, nomes.get(i));
                        }
                        break;
                    }
                    boolean nomeEncontrado = false;
                    for (int i = 0; i < nomes.size(); i++) {
                        if(nomes.get(i).toLowerCase().contains(termo.toLowerCase())){
                            System.out.printf("%d- %s%n",i+1,nomes.get(i));
                            nomeEncontrado = true;
                        }
                    }
                    if(!nomeEncontrado){
                        System.out.println("nome nao encontrado, incorrespondente a busca");
                    }
                    break;

                case 5:
                    System.out.println("-- EDITAR NOME --");
                    if(nomes.isEmpty()){
                        System.out.println("nome nao cadastrado");
                    }
                    for (int i = 0; i <nomes.size(); i++) {
                        System.out.printf("%d- %s%n",i+1,nomes.get(i));
                    }
                    System.out.println("digite o NUMERO do nome a editar: (confira acima)");

                    int posicao;

                    while (!entrada.hasNextInt()){
                        System.out.println("digite um numero valido na listagem!");
                        entrada.next();
                    }
                    posicao = entrada.nextInt();
                    entrada.nextLine();

                    if(posicao < 1 || posicao > nomes.size()){
                        System.out.println("numeros fora do intervalo");
                        break;
                    }
                    String nomeAtual = nomes.get(posicao -1);
                    System.out.printf("nome atual = %s",nomeAtual + (" /aperte enter para seguir"));
                    entrada.nextLine();
                    System.out.println("digite o novo nome: ");
                    String nomeNovo = entrada.nextLine().trim();

                    if(nomeNovo.isEmpty()){
                        System.out.println("nome vazio nao eh permitido");
                    }
                    boolean duplicado = false;
                    for (int i = 0; i < nomes.size() ; i++) {
                        if(i!=(posicao -1) && nomes.get(i).equalsIgnoreCase(nomeNovo)){
                            duplicado = true;
                            break;
                        }
                    }
                    if(duplicado){
                        System.out.println("nome ja existente");
                    }else{
                        nomes.set(posicao -1, nomeNovo);
                        System.out.println("seu nome foi atualizado!");
                    }
                    break;

                case 6:
                    System.out.println("voce esta encerrando o programa!");
                    break;
                default:
                    System.out.println("opcao invalida!, tente usar as opccoes de 1 a 4");
                    break;
            }
        }while(opcao != 6);

        System.out.println("Programa Encerrado.");
        entrada.close();

        }

    }

