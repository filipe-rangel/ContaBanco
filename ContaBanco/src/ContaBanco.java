import java.util.Scanner;


public class ContaBanco{

    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner banco = new Scanner(System.in);
        
    
        System.out.println("digite sua agencia: ");
        String agencia = banco.nextLine();

        System.out.println("digite o numero da conta:");
        int numero = banco.nextInt();
        banco.nextLine();

        System.out.println("digite seu nome completo:");
        String nome = banco.nextLine();

        double saldo = 237.48;  
        System.out.print("olá, " + nome + "! obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + " "+ numero + " e seu saldo $" + saldo + " já está disponivel para saque.");

        banco.close();
    }
}