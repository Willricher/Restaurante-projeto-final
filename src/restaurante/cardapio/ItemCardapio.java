package restaurante.cardapio;

public abstract class ItemCardapio {
    private String nome;
    private double valor;
    private int calorias;

    public ItemCardapio(String nome, double valor, int calorias) {
        this.nome = nome;
        this.valor = valor;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void pegarInformacoes() {
        System.out.printf("""
                \nNome: %s
                Valor: %.2f
                Calorias: %d\n""",
                this.nome, this.valor, this.calorias);
    }

}
