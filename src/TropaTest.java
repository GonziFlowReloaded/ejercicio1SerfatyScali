
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TropaTest {
    @Test
    void debe_crear_un_soldado() {
        Cuchillo armaMelee = new Cuchillo();
        Imprimeinador impresor = new Imprimeinador();

        Ametralladora armaRango = new Ametralladora("AK-47", 1.25f, 3);
        Soldado soldado = new Soldado("Stan", 1.5f, 100f, armaMelee, armaRango);
        
        Tanque tanque = new Tanque("Tanque", 1.5f, 100f, soldado);

        impresor.printearTexto(tanque.imprimir());
        System.out.println("");
        impresor.printearTexto(soldado.imprimir());

        assertEquals("[Soldado] Nombre: Stan Vida: 100.0 Daño 1.5 ", soldado.imprimir());
        

    }
}
    