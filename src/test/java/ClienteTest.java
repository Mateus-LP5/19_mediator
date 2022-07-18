import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRealizarPedido() {
        Cliente cliente = new Cliente("Jubisvaldo");
        Pedido pedido = new Pedido("Paella", 35.70);
        assertEquals("Pedido recebido na cozinha", cliente.realizarPedido(pedido));
    }
}