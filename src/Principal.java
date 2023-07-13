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

        do {
            System.out.println("Digite a nota de Português (0 a 10):");
            nota01.portugues = leitura.nextDouble();
        } while (nota01.portugues < 0 || nota01.portugues > 10);

        do {
            System.out.println("Digite a nota de Matemática (0 a 10):");
            nota01.matematica = leitura.nextDouble();
        } while (nota01.matematica < 0 || nota01.matematica > 10);

        do {
            System.out.println("Digite a nota de Arte (0 a 10):");
            nota01.arte = leitura.nextDouble();
        } while (nota01.arte < 0 || nota01.arte > 10);

        do {
            System.out.println("Digite a nota de Ciência (0 a 10):");
            nota01.ciencia = leitura.nextDouble();
        } while (nota01.ciencia < 0 || nota01.ciencia > 10);

        do {
            System.out.println("Digite a nota de História (0 a 10):");
            nota01.historia = leitura.nextDouble();
        } while (nota01.historia < 0 || nota01.historia > 10);

        do {
            System.out.println("Digite a nota de Educação Física (0 a 10):");
            nota01.educacaoFisica = leitura.nextDouble();
        } while (nota01.educacaoFisica < 0 || nota01.educacaoFisica > 10);

        nota01.NotaFinal();
    }
}