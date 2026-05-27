package restaurante.cardapio;

public class PratoPrincipal extends ItemCardapio {
    private String tipoDeProteina;

    public PratoPrincipal(String nome, double valor, int calorias, String tipoDeProteina) {
        super(nome, valor, calorias);
        this.tipoDeProteina = tipoDeProteina;
    }

    public String getTipoDeProteina() {
        return tipoDeProteina;
    }
    public void setTipoDeProteina(String tipoDeProteina) {
        this.tipoDeProteina = tipoDeProteina;
    }

    @Override
    public void pegarInformacoes() {
        System.out.printf("""
                \nNome: %s
                Valor: %.2f
                Calorias: %d
                Tipo de Proteína: %s""",
                super.getNome(), super.getValor(), super.getCalorias(), this.tipoDeProteina);
    }
}
