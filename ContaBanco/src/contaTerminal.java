import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor digite o número da agência");
        String agencia = scanner.next();
        

        System.out.println("Número");
        int numero = scanner.nextInt();
        
        double saldo = 237.48;

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + 
        " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
