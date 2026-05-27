package restaurante.cardapio;

public class Bebida extends ItemCardapio {
    private String tipoDeBebida;
    private String cor;

    public Bebida(String nome, double valor, int calorias, String tipoDeBebida, String cor) {
        super(nome, valor, calorias);
        this.tipoDeBebida = tipoDeBebida;
        this.cor = cor;
    }

    public String getTipoDeBebida() {
        return tipoDeBebida;
    }
    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void pegarInformacoes() {
        System.out.printf("""
                \nNome: %s
                Valor: %.2f
                Calorias: %d
                Tipo de bebida: %s
                Cor: %s""",
                super.getNome(), super.getValor(), super.getCalorias(), this.tipoDeBebida, this.cor);
    }
}
