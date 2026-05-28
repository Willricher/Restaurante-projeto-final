package restaurante.entidades;

public class Entregador extends Entidade {
    private String placaMoto;

    public Entregador(String nome, String placaMoto) {
        super(nome);
        this.placaMoto = placaMoto;
    }
}
