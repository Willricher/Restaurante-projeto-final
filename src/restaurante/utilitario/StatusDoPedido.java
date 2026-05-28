package restaurante.utilitario;

public enum StatusDoPedido {
    SENDO_CRIADO("Sendo criado"), NA_FILA("Na fila"), EM_PREPARO("Em preparo"), PRONTO("Pronto e esperando entregador"),
    A_CAMINHO("A caminho do endereço"), ENTREGUE("Entregue");

    private String descricao;

    StatusDoPedido(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return descricao;
    }
}
