import model.Celular;
import model.Eletronico;
import model.Garantia;
import model.Notebook;
import util.ValidadorEntrada;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.IO.*;

void main() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Eletronico> estoque = new ArrayList<>();

    println("=== Bem vindo a Eletronics Shop ===");
    int opcao;

    do {
        println("Digite 1 para Cadastrar Celular");
        println("Digite 2 para Cadastrar Notebook");
        println("Digite 3 para Listar produtos");
        println("Digite 0 para Sair");

        opcao = ValidadorEntrada.correcaoInt(scanner, "Informe a opção desejada: ");


        switch (opcao) {

            case 1:
                println("Cadastrar Celular: ");
                String nomeCelular = ValidadorEntrada.correcaoTexto(scanner, "Insira o nome: ");
                double precoCelular = ValidadorEntrada.correcaoDouble(scanner, "Insira o preço: ");
                String marcaCelular = ValidadorEntrada.correcaoTexto(scanner, "Insira a marca: ");
                int ram = ValidadorEntrada.correcaoInt(scanner, "Insira a quantidade de ram: ");
                Celular c = new Celular(nomeCelular, precoCelular, marcaCelular, ram);
                estoque.add(c);
                break;

            case 2:
                println("Cadastrar Notebook: ");
                String nomeNote = ValidadorEntrada.correcaoTexto(scanner, "Insira o nome: ");
                double precoNote = ValidadorEntrada.correcaoDouble(scanner, "Insira o preço: ");
                String marcaNote = ValidadorEntrada.correcaoTexto(scanner, "Insira a marca: ");
                String processador = ValidadorEntrada.correcaoTexto(scanner, "Insira o modelo do processador: ");
                Notebook n = new Notebook(nomeNote, precoNote, marcaNote, processador);
                estoque.add(n);
                break;

            case 3:
                println("Listar produtos: ");
                if (estoque.isEmpty()) {
                    println("Nenhum produto cadastrado !\n Cadastre um produto !");
                } else {
                    for (Eletronico item : estoque) {
                        println("----------------------------------------");
                        println("Nome: " + item.getNome());
                        println("Marca: " + item.getMarca());
                        println("Preço Base: R$ " + item.getPrecoBase());

                        // Mudamos 'c' para 'cel' e 'n' para 'not' para evitar conflito com os case 1 e 2
                        if (item instanceof Celular cel) {
                            println("Memória RAM: " + cel.getMemoriaRam() + " GB");
                        } else if (item instanceof Notebook not) {
                            println("Processador: " + not.getProcessador());
                        }

                        println("Valor final: R$ " + item.calcularPrecoFinal());

                        Garantia g = (Garantia) item;
                        println("Garantia de " + g.getPrazoGarantiaMeses() + " meses.");
                        println(g.getTermosGarantia());
                        println("----------------------------------------");
                    }
                }
                break;

            case 0:
                println("Sair !!!");
                break;

            default:
                println("Opção inválida !");
                break;
        }

    } while (opcao != 0);

    scanner.close();

}
