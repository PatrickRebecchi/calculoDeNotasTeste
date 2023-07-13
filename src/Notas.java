public class Notas {
// notas que vou usar na parte principal
    double portugues;
    double matematica;
    double arte;
    double ciencia;
    double historia;
    double educacaoFisica;

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

