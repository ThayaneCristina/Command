public class Vestido {

    private String modelo;
    private float preco;
    private String situacao;

    public Vestido(String modelo, float preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getSituacao() {
        return situacao;
    }

    public void alugarVestido() {
        this.situacao = "Vestido alugado";
    }

    public void devolverVestido() {
        this.situacao = "Vestido devolvido";
    }

}
