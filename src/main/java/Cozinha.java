import java.util.ArrayList;
import java.util.List;

public class Cozinha implements Setor {

    private List<Pedido> pedidosRecebidos = new ArrayList<>();

    private static Cozinha instancia = new Cozinha();

    private Cozinha (){}

    public static Cozinha getInstancia(){
        return instancia;
    }

    @Override
    public String receberPedido(Pedido pedido) {
        this.pedidosRecebidos.add(pedido);
        return "Pedido recebido na cozinha";
    }
}
