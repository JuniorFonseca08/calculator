package com.calculator.utils;


import com.calculator.model.UserModel;

import java.util.Scanner;

public class MenuUtils {


    static UserModel user;

    public void menu() {

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃             CALCULADORA            ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃        Bem vindo " + user.getName() + "    ");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃  Digite a expressão desejada       ┃");
        System.out.println("┃  (por exemplo, 2 + 3, com espaços) ┃");
        System.out.println("┃  ou digite SAIR para encerrar      ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);

        user = new UserModel();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃           CALCULADORA         ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃ Antes de começarmos, queremos ┃");
        System.out.println("┃     saber mais sobre você.    ┃");
        System.out.println("┃   Por favor, responda às      ┃");
        System.out.println("┃     perguntas abaixo:         ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.print("┃ Nome: ");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.print("┃ Profissão: ");
        String occupation = scanner.nextLine();
        user.setOccupation(occupation);
        System.out.print("┃ UF: ");
        String state = scanner.nextLine();
        user.setState(state);
        System.out.print("┃ Idade: ");
        int age = scanner.nextInt();
        user.setAge(age);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

}
