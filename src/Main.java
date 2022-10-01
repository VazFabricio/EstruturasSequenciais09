import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        double total;

        System.out.print("Digite a temperatura em Fahrenheit para converte-la em Celsius: ");
        fahrenheit = sc.nextDouble();

        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.printf(fahrenheit + " graus Fahrenheit em Celsius e igual a %.1f", celsius);
    }
}