public class Cliente {

    String nome;

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String realizarPedido(Pedido pedido){
        return Balcao.getInstancia().receberPedido(pedido);
    }
}
