public class Balcao implements Setor {

    private static Balcao instancia = new Balcao();

    private Balcao(){}

    public static Balcao getInstancia(){
        return instancia;
    }

    public String receberPedido(Pedido pedido) {
        return Cozinha.getInstancia().receberPedido(pedido);
    }
}
