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

        aluno1.lerInformacoes(); // Chamada do método para ler as informações do aluno

        System.out.printf("Obrigado pelas informações, %s%n", aluno1.nome);
        System.out.println("Aluno localizado");
        System.out.println("Liberado para conferir as notas");
        System.out.println("Digite a nota de Portugues");
        nota01.portugues = leitura.nextInt();
        System.out.println("Digite a nota de Matematica");
        nota01.matematica = leitura.nextInt();
        System.out.println("Digite a nota de Arte");
        nota01.arte = leitura.nextInt();
        System.out.println("Digite a nota de Ciencia");
        nota01.ciencia = leitura.nextInt();
        System.out.println("Digite a nota de Historia");
        nota01.historia = leitura.nextInt();
        System.out.println("Digite a nota de Educação Fisica");
        nota01.educacaoFisica = leitura.nextInt();

        nota01.NotaFinal();
    }
}