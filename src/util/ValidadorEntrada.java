package util;

import java.util.Scanner;

public class ValidadorEntrada {

    public static String correcaoTexto(Scanner scanner, String mensagem) {
        String entrada;
        while (true) {
            IO.print(mensagem);
            entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            }
            IO.println("O campo não pode ficar em branco !!!\n Favor insira um dado válido !!!");
        }
    }

    public static int correcaoInt(Scanner scanner, String mensagem) {
        while (true) {
            IO.print(mensagem);
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                }
                IO.println("Impossivel salvar um numero negativo !!!\n Insira um numero valido !!!");
            } catch (NumberFormatException e) {
                IO.println("Insira um numero !!!");
            }
        }
    }

    public static double correcaoDouble(Scanner scanner, String mensagem) {
        while (true) {
            IO.print(mensagem);
            try {
                String entrada = scanner.nextLine().trim().replace(",", ".");
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                IO.println("O numero digitado é menor que 0 !!!\n Insira um valor maior que 0 !!!");
            } catch (NumberFormatException e) {
                IO.println("Digite somente numeros !!!");
            }
        }
    }
}
