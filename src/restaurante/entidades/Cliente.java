package restaurante.entidades;

public class Cliente extends Entidade {
        String endereco;

        public Cliente(String nome, String endereco) {
                super(nome);
                this.endereco = endereco;
        }

        public String getEndereco() {
                return endereco;
        }
        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }
}
