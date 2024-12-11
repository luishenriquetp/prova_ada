import java.util.Scanner;
public class Exercício03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de membros da família:");
        int membros = sc.nextInt();

        System.out.println("Informe a quantidade de fatias de pizza:");
        int fatias = sc.nextInt();

        int divisao = (fatias / membros);
        int resto = (fatias % membros);

        System.out.println("A quantidade de fatias por membro é: " + divisao + ".");
        if (resto > 0) {
            int sugestao = membros - resto;
            System.out.println("A quantidade de fatias que sobrou é: " + resto + ". Para que todos comam igualmente é necessário adicionar mais " + sugestao + " fatias.");
        } else {
            System.out.println("Não sobraram fatias, todos comeram igualmente!");
        }

    }
}