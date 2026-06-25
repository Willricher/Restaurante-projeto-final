package restaurante.utilitario;

public enum Bairros {
    CENTRO("Centro", 0), IGARA("Igara", 1.1), GUAJUVIRAS("Guajuviras", 1.5),
    MATHIAS_VELHO("Mathias Velho", 1), HARMONIA("Harmonia", 1), FATIMA("Fátima", 1.1),
    NITEROI("Niterói", 1.2), NOSSA_SRA("Nossa Sra. das Graças", 1.2), RIO_BRANCO("Rio Branco", 1.3),
    ESTANCIA("Estância Velha", 1.1), OLARIA("Olaria", 999.67);

    private String nome;
    private double multiplicador;

    Bairros(String nome, double multiplicador) {
        this.nome = nome;
        this.multiplicador = multiplicador;
    }

    String getDescricao() {
        return nome;
    }
    double getMultiplicador() { return multiplicador; }
}
