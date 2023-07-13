import java.util.Scanner;

public class Notas {
// notas que vou usar na parte principal
    double portugues;
    double matematica;
    double arte;
    double ciencia;
    double historia;
    double educacaoFisica;

    void lerNotas(Scanner leitura) {
        do {
            System.out.println("Digite a nota de Português (0 a 10):");
            portugues = leitura.nextDouble();
        } while (portugues < 0 || portugues > 10);

        do {
            System.out.println("Digite a nota de Matemática (0 a 10):");
            matematica = leitura.nextDouble();
        } while (matematica < 0 || matematica > 10);

        do {
            System.out.println("Digite a nota de Arte (0 a 10):");
            arte = leitura.nextDouble();
        } while (arte < 0 || arte > 10);

        do {
            System.out.println("Digite a nota de Ciência (0 a 10):");
            ciencia = leitura.nextDouble();
        } while (ciencia < 0 || ciencia > 10);

        do {
            System.out.println("Digite a nota de História (0 a 10):");
            historia = leitura.nextDouble();
        } while (historia < 0 || historia > 10);

        do {
            System.out.println("Digite a nota de Educação Física (0 a 10):");
            educacaoFisica = leitura.nextDouble();
        } while (educacaoFisica < 0 || educacaoFisica > 10);
    }

    boolean validarNotas() {
        if (portugues < 0 || portugues > 10 ||
                matematica < 0 || matematica > 10 ||
                arte < 0 || arte > 10 ||
                ciencia < 0 || ciencia > 10 ||
                historia < 0 || historia > 10 ||
                educacaoFisica < 0 || educacaoFisica > 10) {
            return false;
        }
        return true;
    }

    void NotaFinal() {
        if (!validarNotas()) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return;
        }
        double notaFinal = (portugues + matematica + arte + ciencia + historia + educacaoFisica) / 6;
        System.out.printf("Nota final: %.1f%n", notaFinal);
        if (notaFinal >= 6) {
            System.out.println("Parabéns, você passou!");
        } else {
            System.out.println("Infelizmente você repetiu... Até o próximo ano!!!");
        }
    }

}

