package Desafios2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opcao = 0;
        
        Scanner sc = new Scanner(System.in);
        Uchiha ninja = new Uchiha();
        
        while(opcao != 4) {
            System.out.println("============MENU DE OPÇÕES============");
            System.out.println("1- Cadastrar novo ninja");
            System.out.println("2- Informações do ninja");
            System.out.println("3- Atualizar habilidades especiais");
            System.out.println("4- Sair");
            System.out.print("\nDigite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Cadastrando novo ninja");
                    System.out.print("Nome: ");
                    ninja.nome = sc.nextLine();
                    System.out.print("Idade: ");
                    ninja.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Habilidade Especial: ");
                    ninja.habilidadeEspecial = sc.nextLine();
                    System.out.print("Missão: ");
                    ninja.missao = sc.nextLine();
                    System.out.print("Nível de Dificuldade: ");
                    ninja.nivelDificuldade = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Status da Missão: ");
                    ninja.statusMissao = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Informações do ninja:");
                    ninja.ninjaInfo();
                    break;
                case 3:
                    System.out.print("Digite sua nova habilidade especial: ");
                    ninja.habilidadeEspecial = sc.nextLine();
                    break;
                case 4:
                    System.out.println("Saindo do Menu...");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        sc.close();
    }
}
