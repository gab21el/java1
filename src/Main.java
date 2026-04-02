import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boas vindas! Insira seus dados no console: ");
        System.out.println("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Altura: ");
        int altura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Estado civil: ");
        String ec = scanner.nextLine();
        System.out.println("Seu nome é "+ nome + "\nSeu cpf " + cpf + "\nsua idade " + idade + "\nsua altura " + altura + "\ne seu estado civil é " + ec);


    }
}
