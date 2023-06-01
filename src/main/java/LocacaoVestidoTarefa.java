public class LocacaoVestidoTarefa implements Tarefa {

    private Vestido vestido;

    public LocacaoVestidoTarefa (Vestido vestido) {
        this.vestido = vestido;
    }

    public void executar() {
        this.vestido.alugarVestido();
    }

    public void cancelar() {
        this.vestido.devolverVestido();
    }

}
