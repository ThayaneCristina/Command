import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    Loja loja;
    Vestido vestido;

    @BeforeEach
    void setUp() {
        loja = new Loja();
        vestido = new Vestido("romantico", 500.0f);
    }

    @Test
    void deveAlugarVestido() {
        Tarefa alugarVestido = new LocacaoVestidoTarefa(vestido);
        loja.executarTarefa(alugarVestido);

        assertEquals("Vestido alugado", vestido.getSituacao());
    }

    @Test
    void deveDevolverVestido() {
        Tarefa devolverVestido = new DevolucaoVestidoTarefa(vestido);
        loja.executarTarefa(devolverVestido);

        assertEquals("Vestido devolvido", vestido.getSituacao());
    }

    @Test
    void deveCancelarDevolucaoVestido() {
        Tarefa alugarVestido = new LocacaoVestidoTarefa(vestido);
        Tarefa devolverVestido = new DevolucaoVestidoTarefa(vestido);

        loja.executarTarefa(alugarVestido);
        loja.executarTarefa(devolverVestido);

        loja.cancelarUltimaTarefa();

        assertEquals("Vestido alugado", vestido.getSituacao());
    }

}
