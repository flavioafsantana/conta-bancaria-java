import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exibirMenu = true;
        double saldo = 2500.00;
        String quebraLinha = """
                *****************************************************""";
        String dadosCliente = """
                                  Flavio Santana
                            Agencia: 0001 Conta: 01234-5
                """;
        System.out.println(quebraLinha);
        System.out.println(dadosCliente);
        System.out.println("             Saldo da conta: R$ "+saldo);
        System.out.println(quebraLinha);
        String menu = """
                    
                    Operações
                    
                    1- Consultar Saldo
                    2- Depositar
                    3- Sacar
                    4- Sair
                    
                    Digite a opção desejada:
                    """;
        Scanner teclado = new Scanner(System.in);

        while(exibirMenu){
            System.out.println(menu);
            int opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Saldo da conta: R$ "+saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do déposito: ");
                    double deposito = teclado.nextDouble();
                    if (deposito > 0) {
                        System.out.println("Você depositou R$ "+ deposito);
                        saldo += deposito;
                        System.out.println("Saldo atualizado: R$ "+saldo);
                        break;
                    } else {
                        System.out.println("Você digitou um valor inválido, por favor refaça a transação.");
                        break;
                    }
                case 3:
                    System.out.println("Digite o valor do saque desejado: ");
                    double saque = teclado.nextDouble();
                    if (saque <= saldo) {
                        System.out.println("Você sacou R$ "+ saque);
                        saldo -= saque;
                        System.out.println("Saldo atualizado: R$ "+saldo);
                        break;
                    } else {
                        System.out.println("Não há saldo suficiente para realizar o saque.");
                        break;
                    }
                case 4:
                    System.out.println("Obrigado por ser nosso cliente!");
                    exibirMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
    }
}