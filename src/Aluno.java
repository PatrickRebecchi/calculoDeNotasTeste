import java.util.Scanner;
public class Aluno {
    String nome;
    int idade;
    int numeroAluno;
    String anoEscolar;

    public void lerInformacoes() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        nome = leitura.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = leitura.nextInt();
        System.out.println("Digite o número do aluno na chamada: ");
        numeroAluno = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o ano que o aluno está cursando: ");
        anoEscolar = leitura.nextLine();
    }
}
