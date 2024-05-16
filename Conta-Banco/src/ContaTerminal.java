import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main (String []args) throws Exception{

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("BEM VINDO AO BANCO:");

        System.out.println("DIGITE O NUMERO DA SUA CONTA:");
        int numero = scanner.nextInt();

        System.out.println("DIGITE O NUMERO DA SUA AGENCIA:");
        double agencia = scanner.nextDouble();

        System.out.println("DIGITE SEU NOME:");
        String nome = scanner.next();

        double saldo = 487.95;

        System.out.println("OLÁ " +  nome + " , ");
        System.out.println("OBRIGADO POR CRIAR UMA CONTA EM NOSSO BANCO, ");
        System.out.println("SUA AGENCIA É " + agencia + ",");
        System.out.println("CONTA " + numero );
        System.out.println("E SEU SALDO " + saldo +" JA ESTA DISPONIVEL PARA SAQUE.");
    


        //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        // sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

   
   
   
    }


    }