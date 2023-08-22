import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        int numero;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        Scanner scan = new Scanner(System.in); //importando a classe scanner
        scan.useLocale(Locale.US); //utilizando o "." para conseguir utilizar a formatação correta

        

       System.out.println("Por favor, digite o número da Conta !"); //Exibir a mensagem para o usuario
       numero = scan.nextInt();//obter pela scanner os valores digitados

       scan.nextLine();

       System.out.println("Por favor, digite o número da Agência!"); //Exibir a mensagem para o usuario
       agencia = scan.nextLine();//obter pela scanner os valores digitados

       System.out.println("Por favor, digite o seu nome !");//Exibir a mensagem para o usuario
       nomeCliente = scan.nextLine();//obter pela scanner os valores digitados
       
       System.out.println("Por favor, digite o seu Saldo !");//Exibir a mensagem para o usuario
       saldo = scan.nextDouble();//obter pela scanner os valores digitados

       BigDecimal meuBigDecimal = new BigDecimal(Double.toString(saldo)); //Usando a classe o bigdecimal para ter uma precisão maior no valor do saldo


       System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é : "  +agencia+ ", conta "+numero+ " e seu saldo é de R$" +meuBigDecimal+" já está disponível para saque");//Exibir a mensagem final para o usuario
       scan.close();//encerrando o scanner
    }
}
