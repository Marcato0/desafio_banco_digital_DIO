import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta contacorrente = new ContaCorrente();
        Conta contapoupanca = new ContaPoupanca();


        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor Gostaria de Depositar na Sua Conta Corrente ?");
        double valorCC = Double.parseDouble(teclado.nextLine());
        contacorrente.depositar(valorCC);

        System.out.println("Gostaria de transferir algum valor para conta poupança ?");
        System.out.println("Pressione 0 para SIM ou 1 para NÃO");
        int condicao = Integer.parseInt(teclado.nextLine());


        if (condicao == 0 ){
            System.out.println("Informe o valor :");
            double valorP = Double.parseDouble(teclado.nextLine());
            contacorrente.transferir(valorP, contapoupanca);
        }
        else{
            System.out.println("Até a proxima");
        }


        contacorrente.extrato();
        contapoupanca.extrato();

    }
}
