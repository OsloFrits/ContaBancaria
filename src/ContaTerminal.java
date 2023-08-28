import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String nome, agencia;
        double saldo;
        System.out.println("Por favor digite o seu Nome");
        nome = sc.nextLine();
        System.out.println("Numero da agencia");
        agencia = sc.nextLine();
        System.out.println("Numero da conta");
        numero = sc.nextInt();
        System.out.println("E por fim o saldo");
        saldo = sc.nextDouble();
        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}