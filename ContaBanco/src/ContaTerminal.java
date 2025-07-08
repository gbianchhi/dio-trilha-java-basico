import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta e aperte ENTER");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a agencia e aperte ENTER");
        agencia = sc.nextLine();
        System.out.println("Digite seu nome e aperte ENTER");
        nomeCliente = sc.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo "+saldo + " já está disponível para saque");
    }
}