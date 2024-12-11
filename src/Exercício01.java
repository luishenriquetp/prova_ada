import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço do combustível:");
        double preco = sc.nextDouble();
        double quantosLitros = 360.0/12.0;
        double custoTotal = quantosLitros * preco;

        System.out.println("O custo total da viagem será: " + custoTotal);
        System.out.println("A quantidade de litros necessária para a viagem será: " + quantosLitros);
    }
}