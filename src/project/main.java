package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcoes func = new funcoes();

        while(true){
            try {
                System.out.println("\nMenu: ");
                System.out.println("[1] - Cadastra Aluno ");
                System.out.println("[2] - Cadastra Curso");
                System.out.println("[3] - Cadastrar Nota");
                System.out.println("Digite a opção: ");
                int menu = sc.nextInt();
                if (menu == 1) {
                    func.cadastraAlunos();
                } else if (menu == 2) {
                    func.cadastraCurso();
                }else if (menu == 3) {
                    func.cadastraNota();
                }else if (menu == 8) {
                    System.out.println("Finalizando...");
                    System.exit(0);
                }else {
                System.out.println("Opção inválida, tente novamente!");
                }
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Digite apenas numeros validos!");
            }
        }

    }
}
