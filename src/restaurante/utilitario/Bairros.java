package restaurante.utilitario;

public enum Bairros {
    CENTRO("Centro"), IGARA("Igara"), GUAJUVIRAS("Guajuviras"), MATHIAS_VELHO("Mathias Velho"),
    HARMONIA("Harmonia"), FATIMA("Fátima"), NITEROI("Niterói"), NOSSA_SRA("Nossa Sra. das Graças"),
    RIO_BRANCO("Rio Branco");

    private String nome;

    Bairros(String nome) {
        this.nome = nome;
    }

    String getDescricao() {
        return nome;
    }
}
