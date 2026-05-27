package restaurante.cardapio;

public class Sobremesa extends ItemCardapio {
    public String tipoDeSobremesa;

    public Sobremesa(String nome, double valor, int calorias, String tipoDeSobremesa) {
        super(nome, valor, calorias);
        this.tipoDeSobremesa = tipoDeSobremesa;
    }

    public String getTipoDeSobremesa() {
        return tipoDeSobremesa;
    }
    public void setTipoDeSobremesa(String tipoDeSobremesa) {
        this.tipoDeSobremesa = tipoDeSobremesa;
    }

    @Override
    public void pegarInformacoes() {
        System.out.printf("""
                \nNome: %s
                Valor: %.2f
                Calorias: %d
                Tipo de sobremesa: %s""",
                super.getNome(), super.getValor(), super.getCalorias(), this.tipoDeSobremesa);
    }
}
