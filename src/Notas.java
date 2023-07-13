public class Notas {
// notas que vou usar na parte principal
    double portugues;
    double matematica;
    double arte;
    double ciencia;
    double historia;
    double educacaoFisica;


    void NotaFinal(){
        double notaFinal;
        notaFinal = (portugues + matematica + arte + ciencia * historia + educacaoFisica) / 6;
        System.out.printf("Nota final: %.1f%n", notaFinal);
        if (notaFinal >= 6){
            System.out.println("Parabens você passou");
        } else {
            System.out.println("Infelizmente você repetiu.. Até ano que vem!!!");
        }
    }
}

