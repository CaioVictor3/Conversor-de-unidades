import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcao = 0;
        double celsius = 0;
        double km = 0;
        double metros = 0;
        double op = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("====Menu====");
            System.out.println("1 - Converter de Quilometros para Milhas ");
            System.out.println("2 - Converter de Celsius para Fahrenheit");
            System.out.println("3 - Converter de Metros para Pés");
            System.out.println("4 - Sair");
            System.out.println("Qual opção deseja realizar?");
            opcao = scanner.nextInt();
            while (opcao < 1 || opcao > 4) {
                System.out.println("Valor Inválido");
                System.out.println("Digite o valor novamente");
                opcao = scanner.nextInt();
            }

            if (opcao == 1) {
                System.out.println("Digite o valor em KM que deseja converter para Milhas: ");
                km = scanner.nextDouble();
                op = km / 1.609;
                System.out.println(km + " Km é igual a " + op + " milhas");

            } else if (opcao == 2) {
                System.out.println("Digite o valor em Celsius que deseja converter para Fahrenheit: ");
                celsius = scanner.nextDouble();
                op = (celsius * 1.8) + 32;
                System.out.println(celsius + "°C é igual a " + op + "°F");

            } else if (opcao == 3) {
                System.out.println(" Digite o valor em Metros que deseja converter para Pés:");
                metros = scanner.nextDouble();
                op = metros * 3.281;

                System.out.println(metros + " Metros é igual a " + op + " Pés");
            }
        } while (opcao != 4);
    }
}