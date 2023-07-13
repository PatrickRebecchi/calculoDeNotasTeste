import java.util.Locale;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            Aluno aluno1 = new Aluno();
            NotasFinal nota01 = new NotasFinal();
            Locale.setDefault(Locale.US);
            System.out.println("***************************************");
            System.out.println("Seja bem-vindo ao medido de notas");
            System.out.println("***************************************");
            System.out.println("Digite o seu Nome: ");
            aluno1.nome = leitura.nextLine();
            System.out.println("Digite a sua idade; ");
            aluno1.idade = leitura.nextInt();
            System.out.println("Digite o numero do aluno na chamada: ");
            aluno1.numeroAluno = leitura.nextInt();
            System.out.println("Digite o ano que o aluno está cursando: ");
            aluno1.anoEscolar = leitura.nextLine();
            leitura.nextLine();
            System.out.printf("Obrigado pelas informções %s%n", aluno1.nome);
            System.out.println("""
        Aluno localizado
        Liberado para conferir as notas
        """);
    }
}