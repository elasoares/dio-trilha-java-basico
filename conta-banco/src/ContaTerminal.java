import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o número da sua Agência: ");
        int agencia = entrada.nextInt();
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = entrada.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        String nome = entrada.next();
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo +","+ " já estão disponível para saque.");

        entrada.close(); 
    }
}
