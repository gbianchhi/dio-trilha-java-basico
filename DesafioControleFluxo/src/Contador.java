import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        boolean sucesso = false;
        int interacao = 0;

        while (!sucesso) {
            try {
                System.out.println("Digite o primeiro numero:");
                int num1 = sc.nextInt();
                System.out.println("Digite o segundo numero:");
                int num2 = sc.nextInt();
                contar(num2, num1);
                sucesso = true;
                interacao = num2 - num1;


            } catch (ParametrosInvalidosException e){
                ParametrosInvalidosException.excecao();
            }
            }
        System.out.println(interacao);

        for(int i=1; i<=interacao; i++) {
            System.out.println("Imprimindo numero " + i);
        }
    }
    public static void contar(int num2, int num1)throws ParametrosInvalidosException {
        int interacao = num2 - num1;
        if(interacao <= 0) {
            throw new ParametrosInvalidosException();
        }
    }


}