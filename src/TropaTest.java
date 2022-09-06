
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TropaTest {
    @Test
    void debe_crear_un_tanque() {
        Cuchillo armaMelee = new Cuchillo();
        Imprimeinador impresor = new Imprimeinador();

        Ametralladora armaRango = new Ametralladora("AK-47", 1.25f, 3);
        Soldado soldado = new Soldado("Stan", 1.5f, 100f, armaMelee, armaRango);
        
        Tanque tanque = new Tanque("Tanque", 1.5f, 100f, soldado);

        impresor.printearTexto(tanque.imprimir());
        System.out.println("");
        impresor.printearTexto(soldado.imprimir());

        assertEquals("[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", soldado.imprimir());
        assertEquals("[Tanque] Nombre: Tanque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", tanque.imprimir());
        

    }

    @Test
    void debe_crear_un_buque(){
        Imprimeinador impresor = new Imprimeinador();
        Cuchillo armaMelee = new Cuchillo();

        Ametralladora armaRango = new Ametralladora("AK-47", 1.25f, 3);
        Soldado soldado = new Soldado("Stan", 1.5f, 100f, armaMelee, armaRango);
        
        Buque buque = new Buque("Buque", 1.5f, 100f, soldado);

        impresor.printearTexto(buque.imprimir());

        assertEquals("[Buque] Nombre: Buque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", buque.imprimir());
    
    }

    @Test
    void debe_crear_un_soldado() {
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        assertNotNull(soldado1);
        assertEquals("soldado1", soldado1.getNombre());
    }

    @Test
    void debe_atacar_a_otra_tropa_tanque_a_soldado(){
        Tropa tanque1 = new Tropa("tanque1", 1, 2.0f);
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Escudo escudo = new Escudo();
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.50f, soldado1.getVida(), 0.0f);
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.0f, soldado1.getVida(), 0.0f);
    }

    @Test 
    void debe_atacar_tanque_a_buque(){
        Tropa tanque = new Tropa("tanque",1,2.0f);
        Tropa buque = new Tropa("buque",1,3.0f);
        Escudo escudo = new Escudo();
        escudo.setDefensa2();
        tanque.atacar(buque, escudo);
        //assertEquals(2.65f, buque.getVida(),0.00f);
        tanque.atacar(buque, escudo);
        tanque.atacar(buque, escudo);
    }

    @Test
    void debe_crear_un_soldado_sin_escudo(){
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Tropa tanque1 = new Tropa("tanque1", 1, 2.0f);
        tanque1.atacar(soldado1, null);
    }

    @Test
    void ataque_diferentes_escudos()
    {
        Tropa tanque2 = new Tropa("tanque_eduardo", 1, 2.0f);
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Escudo escudoT1 = new Escudo();
        escudoT1.setDefensa1();
        Escudo escudoT2 = new Escudo();
        escudoT2.setDefensa0();
        tanque2.atacar(soldado1, escudoT2);
        tanque2.atacar(soldado1, escudoT2);
        tanque2.atacar(soldado1, escudoT2);
    }

}
    