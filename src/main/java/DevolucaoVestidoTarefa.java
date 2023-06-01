public class DevolucaoVestidoTarefa implements Tarefa{

    private Vestido vestido;

    public DevolucaoVestidoTarefa(Vestido vestido) {
        this.vestido = vestido;
    }

    public void executar() {
        this.vestido.devolverVestido();
    }

    public void cancelar() {
        this.vestido.alugarVestido();
    }

}
