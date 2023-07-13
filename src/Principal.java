import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Notas nota01 = new Notas();
        Locale.setDefault(Locale.US);

        System.out.println("***************************************");
        System.out.println("Seja bem-vindo ao medidor de notas");
        System.out.println("***************************************");

        aluno1.lerInformacoes();

        System.out.printf("Obrigado pelas informações, %s%n", aluno1.nome);
        System.out.println("Aluno localizado");
        System.out.println("Liberado para conferir as notas");

        nota01.lerNotas(leitura);

        nota01.NotaFinal();
    }
}