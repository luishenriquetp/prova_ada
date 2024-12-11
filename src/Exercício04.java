import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número:");
        int conferirPrimo = sc.nextInt();

        if (conferirPrimo <= 1) {
            System.out.println("O número " + conferirPrimo + " não é primo.");
            return;
        } else {
            for (int i = 2; i < conferirPrimo; i++) {
                if (conferirPrimo % i == 0) {
                    System.out.println("O número " + conferirPrimo + " não é primo.");
                    return;
                } else if (conferirPrimo % i != 0) {
                    continue;
                }
            }
        }
        System.out.println("O número " + conferirPrimo + " é primo.");
    }
}