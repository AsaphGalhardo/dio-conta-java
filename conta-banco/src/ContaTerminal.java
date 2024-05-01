
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência : ");
         String agencia  = scanner.nextLine();

        System.out.println("Digite o número : ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta : ");
        double saldo = scanner.nextDouble();


        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " ja está disponivel");
    }


}
