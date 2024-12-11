
import java.util.Arrays;
import java.util.Scanner;
public class Exercício02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula a média geral de uma turma de alunos e exibe os que ficaram acima da média.");
        System.out.println("Digite o número de alunos da turma: ");
        double quantidadeAlunos = sc.nextInt();
        double notaTotal = 0;
        String result = "";
        System.out.println("Primeiro vamos calcular a média geral, independente do nome dos alunos.");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Digite a nota do aluno número %.1s: ", i+1);
            double notaAluno = sc.nextDouble();

            notaTotal += notaAluno;
        }
        System.out.println("A média geral dos alunos é " + notaTotal + "\n");
        System.out.println("Agora vamos cadastrar cada aluno com sua respectiva nota");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Digite o nome do %.1sº aluno: ", i+1);
            String aluno = sc.next();

            System.out.printf("Digite a nota desse aluno: ", i+1);
            double notaAluno = sc.nextDouble();

            if (notaAluno > notaTotal/quantidadeAlunos) {
                result += "Aluno: " + aluno + ", Nota: " + notaAluno + "\n";
            }
        }
        System.out.println("Abaixo um log apenas dos alunos acima da média geral da turma");
        System.out.println(result);
    }
}