import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== CALCULADORA JAVA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Módulo");
            System.out.println("6 - Potência");
            System.out.println("7 - Raiz Quadrada");
            System.out.println("9 - Juros Simples");
            System.out.println("10 - Juros Compostos");
            System.out.println("8 - Sair");
            System.out.print("Escolha a opção: ");

            int opcao = sc.nextInt();

            if (opcao == 8) {
                System.out.println("Saindo...");
                break;
            }

            double a, b, resultado = 0;

            switch (opcao) {

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextDouble();
                    resultado = a + b;
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextDouble();
                    resultado = a - b;
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextDouble();
                    resultado = a * b;
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("Erro: divisão por zero.");
                        continue;
                    }
                    resultado = a / b;
                    break;

                case 5:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextDouble();
                    resultado = a % b;
                    break;

                case 6:
                    System.out.print("Digite a base: ");
                    a = sc.nextDouble();
                    System.out.print("Digite o expoente: ");
                    b = sc.nextDouble();
                    resultado = Math.pow(a, b);
                    break;

                case 7:
                    System.out.print("Digite o número: ");
                    a = sc.nextDouble();
                    if (a < 0) {
                        System.out.println("Erro: raiz de número negativo.");
                        continue;
                    }
                    resultado = Math.sqrt(a);
                    break;

                case 9: // Juros Simples
                    System.out.print("Digite o capital inicial: ");
                    double capital = sc.nextDouble();

                    System.out.print("Digite a taxa de juros (%): ");
                    double taxa = sc.nextDouble() / 100;

                    System.out.print("Digite o tempo: ");
                    double tempo = sc.nextDouble();

                    resultado = capital + (capital * taxa * tempo);
                    break;

                case 10: // Juros Compostos
                    System.out.print("Digite o capital inicial: ");
                    capital = sc.nextDouble();

                    System.out.print("Digite a taxa de juros (%): ");
                    taxa = sc.nextDouble() / 100;

                    System.out.print("Digite o tempo: ");
                    tempo = sc.nextDouble();

                    resultado = capital * Math.pow(1 + taxa, tempo);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
            System.out.println();
        }

        sc.close();
    }
}
