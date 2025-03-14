package CodigoFontes;

import java.util.Scanner;
import Classes.ContaTerminal;

public class ProjetoContaBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        ContaTerminal contaTerminal = new ContaTerminal(solicitarNumeroConta(scanner), solicitarAgencia(scanner), solicitarSaldo(scanner), solicitarNomeCliente(scanner));

        mostrarMensagem(contaTerminal);
        scanner.close(); 
    }

    public static int solicitarNumeroConta(Scanner scanner) {
        int resultado = 0;
        
        System.out.println("Por favor informe o número da conta: ");
        resultado = scanner.nextInt();
        
        scanner.nextLine(); 
        
        return resultado;
    }

    public static double solicitarSaldo(Scanner scanner) {
        double resultado = 0;
        
        System.out.println("Por favor, informe o saldo da conta: ");
        resultado = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        return resultado;
    }

    public static String solicitarAgencia(Scanner scanner) {
        String agencia = "";
        
        System.out.println("Por favor, informe a agência da conta: ");
        agencia = scanner.nextLine();
        
        return agencia;
    }

    public static String solicitarNomeCliente(Scanner scanner) {
        String nomeCliente = "";
        
        System.out.println("Por favor, informe o seu nome: ");
        nomeCliente = scanner.nextLine();
        
        return nomeCliente;
    }

    public static void mostrarMensagem(ContaTerminal contaTerminal) {
        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta conosco, sua agência é " + contaTerminal.getAgencia() + ", e o saldo de R$ " + contaTerminal.getSaldo() + " já está disponível para saque.");
    }
}

