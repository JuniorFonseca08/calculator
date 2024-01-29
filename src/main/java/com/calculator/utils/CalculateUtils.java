package com.calculator.utils;

import java.util.Scanner;

public class CalculateUtils {

    private static double resultado;
    private static Scanner scanner = new Scanner(System.in);

    public static void operation() {
        boolean sair = false;
        MenuUtils op = new MenuUtils();
        op.menu();
        do {
            System.out.print("Expressão: ");
            String expressao = scanner.nextLine();

            if (expressao.equalsIgnoreCase("SAIR")) {
                sair = true;
                System.out.print("FIM. ");
                continue;
            }

            String[] partes = expressao.split(" ");

            if (partes.length != 3) {
                System.out.println("ERRO: Expressão inválida. Use o formato: 2 + 2");
                continue;
            }

            double n1, n2;
            try {
                n1 = Double.parseDouble(partes[0]);
                n2 = Double.parseDouble(partes[2]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Certifique-se de que os números são válidos.");
                continue;
            }

            switch (partes[1]) {
                case "+":
                    resultado = n1 + n2;
                    result();
                    break;
                case "-":
                    resultado = n1 - n2;
                    result();
                    break;
                case "*":
                    resultado = n1 * n2;
                    result();
                    break;
                case "/":
                    if (n2 != 0) {
                        resultado = n1 / n2;
                        result();
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Expressão não reconhecida.");
            }
        } while (!sair);
    }

    public static void result() {
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("       RESULTADO: " + resultado);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

}
