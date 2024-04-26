import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Daiene Batagioti";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcaoEscolhida = 0;

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome:             " + nome);
        System.out.println("Tipo de conta:    " + conta);
        System.out.println("Saldo inicial:    R$ " + saldo);
        System.out.println("********************************************");

        String menu = """
                ** Digite sua opção **
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcaoEscolhida != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");

            opcaoEscolhida = leitura.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("O saldo é: " + saldo);

            } else if (opcaoEscolhida == 2) {
                System.out.println("Informe o valor a receber: ");
                double receber = leitura.nextDouble();
                saldo += receber;

                System.out.println("O saldo atualizdo é: " + saldo);

            } else if (opcaoEscolhida == 3) {
                System.out.println("Informe o valor a transferir: ");
                double tranferir = leitura.nextDouble();

                if (tranferir > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= tranferir;

                    System.out.println("O saldo atualizdo é: " + saldo);
                }

            } else if (opcaoEscolhida == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}