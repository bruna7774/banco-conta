//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO:conhecer e importar a classe Scanner

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor digite o numero da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = scanner.nextLine();

        System.out.println("digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("digite o saldo do cliente: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+ numero+" e seu saldo "+saldo+ " já está disponível para saque.");
        
        

        }
    }
