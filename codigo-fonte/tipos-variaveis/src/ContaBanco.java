import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a agência da conta: ");
        contaTerminal.agencia = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o número da conta: ");
        contaTerminal.numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        contaTerminal.nome = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        contaTerminal.saldo = sc.nextDouble();

        sc.nextLine();

        System.out.printf("Olá %s, obrigado " +
                "por criar uma conta em nosso banco, sua agência é " +
                "%s, conta %s e seu saldo %s já está" +
                " disponível para saque.\n",
                contaTerminal.nome, contaTerminal.agencia,
                contaTerminal.numero, contaTerminal.saldo);
        sc.close();
    }
}
