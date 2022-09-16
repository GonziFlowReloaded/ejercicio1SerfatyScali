import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void debe_crear_un_soldado(){
        Soldado soldado = new Soldado("Stan", 1.5f, 100f);
        assertEquals("[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", soldado.imprimir());
    }

    @Test
    public void debe_crear_un_tanque() {
       

        Soldado soldado = new Soldado("Stan", 1.5f, 100f);
        Tanque tanque = new Tanque("Tanque", 1.5f, 100f, soldado);

        tanque.imprimir();
        System.out.println("");
        soldado.imprimir();
        
        assertEquals("[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", soldado.imprimir());
        assertEquals("[Tanque] Nombre: Tanque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", tanque.imprimir());
        

    }

    @Test
    public void debe_crear_un_buque(){
        
        Cuchillo armaMelee = new Cuchillo();

        Ametralladora armaRango = new Ametralladora("AK-47", 1.25f, 3);
        Soldado soldado = new Soldado("Stan", 1.5f, 100f, armaMelee, armaRango);
        
        Buque buque = new Buque("Buque", 1.5f, 100f, soldado);

        buque.imprimir();

        assertEquals("[Buque] Nombre: Buque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Stan Vida: 100.0 Daño: 1.5 ", buque.imprimir());
        
    }
    
    @Test
    public void soldado_debe_disparar(){
        Soldado soldado0 = new Soldado("Stan", 1.5f, 100f);
        Soldado soldado1 = new Soldado("Stan pero es un gemelo malvado", 1.5f, 1f);
        Escudo escudo0 = new Escudo();
        escudo0.setDefensa0();
        Ametralladora armaRango = new Ametralladora("AK-47", 1.25f, 3);
        soldado0.setArmaRango(armaRango);
        soldado0.atacar(soldado1, escudo0, soldado0.danioDistancia());
        assertEquals(0.0f, soldado1.getVida(), 0.0f);
    }

    @Test
    public void tanque_debe_disparar(){
        
        Soldado soldado = new Soldado("Stan", 1.5f, 1f);
        Tanque tanque = new Tanque("Tanque", 2f, 2f, soldado);

        Soldado soldado1 = new Soldado("Jose", 1.5f, 1f);
        Tanque tanque1 = new Tanque("Tanque de jose",2f, 2f, soldado1);
        Escudo escudo1 = new Escudo();
        escudo1.setDefensa1();


        tanque.atacar(tanque1, escudo1, tanque.getDaño());
        assertEquals(1.0f, soldado1.getVida(), 0.0f);
    }


    @Test
    public void debe_crear_un_soldado_old() {
        /* 
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        assertNotNull(soldado1);
        assertEquals("soldado1", soldado1.getNombre());*/
    }

    @Test
    public void debe_atacar_a_otra_tropa_tanque_a_soldado(){
        /*
        Tropa tanque1 = new Tropa("tanque1", 1, 2.0f);
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Escudo escudo = new Escudo();
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.50f, soldado1.getVida(), 0.0f);
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.0f, soldado1.getVida(), 0.0f); */
    }

    @Test 
    public void debe_atacar_tanque_a_buque(){
        /* 
        Tropa tanque = new Tropa("tanque",1,2.0f);
        Tropa buque = new Tropa("buque",1,3.0f);
        Escudo escudo = new Escudo();
        escudo.setDefensa2();
        tanque.atacar(buque, escudo);
        //assertEquals(2.65f, buque.getVida(),0.00f);
        tanque.atacar(buque, escudo);
        tanque.atacar(buque, escudo);*/
    }

    @Test
    public void debe_crear_un_soldado_sin_escudo(){
        /* 
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Tropa tanque1 = new Tropa("tanque1", 1, 2.0f);
        tanque1.atacar(soldado1, null);*/
    }

    @Test
    public void ataque_diferentes_escudos()
    {
        /* 
        Tropa tanque2 = new Tropa("tanque_eduardo", 1, 2.0f);
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Escudo escudoT1 = new Escudo();
        escudoT1.setDefensa1();
        Escudo escudoT2 = new Escudo();
        escudoT2.setDefensa0();
        tanque2.atacar(soldado1, escudoT2);
        tanque2.atacar(soldado1, escudoT2);
        tanque2.atacar(soldado1, escudoT2);*/
    }

    @Test
    public void ataqueSinArmas(){
        Soldado soldado1 = new Soldado("Guillermo", 1.0f, 1.0f);
        Soldado soldado2 = new Soldado("Eduardo", 1.0f, 1.0f);

        soldado1.atacar(soldado2, null, soldado1.danioDistancia());
        assertEquals(0.9f, soldado2.getVida(), 0.0f);
        
    }

    @Test
    public void meterCosasMuseo(){
        Museo museo = new Museo();
        Tanque[] tanquearr = new Tanque[300];
        Soldado[] soldadoarr = new Soldado[300];
        Buque[] buquearr = new Buque[300];
        Soldado soldado = new Soldado("Stan", 1.5f, 100f);
        Soldado chucknorris = new Soldado("Chuck Norris", 30000000.5f, 100f);

        for (int i = 0; i < 300; i++) {
            soldadoarr[i] = new Soldado("Stan", 1.5f, 10f);
            tanquearr[i] = new Tanque("Tanque", 1.5f, 10f, soldado);
            buquearr[i] = new Buque("Buque", 1.5f, 10f, soldado);
        }
        for (int i =  0; i < 300; i++){
            chucknorris.atacar(soldadoarr[i], null, chucknorris.danioDistancia());
            RecursoMuseo muereStan = new RecursoMuseo(soldadoarr[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereStan));
            chucknorris.atacar(tanquearr[i], null, chucknorris.danioDistancia());
            RecursoMuseo muereTanque = new RecursoMuseo(tanquearr[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereTanque));
            chucknorris.atacar(buquearr[i], null, chucknorris.danioDistancia());
            RecursoMuseo muereBuque = new RecursoMuseo(buquearr[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereBuque));
        }
        for (int i= 0; i<900; i++)
        {
            System.out.println(museo.getRecursos().get(i).textoMuseo());
        }
        assertEquals(900, museo.getRecursos().size());
    }
}