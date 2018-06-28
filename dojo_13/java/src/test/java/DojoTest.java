import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {

	}

    @Test
    public void test_el_ancho_de_espadas_mata_al_7_de_espadas() {
        AnchoDeEspadas anchoDeEspadas = new AnchoDeEspadas();
        SieteDeEspadas sieteDeEspadas = new SieteDeEspadas();

        Ronda primerMano = new Ronda(anchoDeEspadas, sieteDeEspadas);

        Assert.assertEquals(primerMano.ganador(), anchoDeEspadas);
    }

    @Test
    public void test_el_ancho_de_basto_mata_al_7_de_espadas() {
        AnchoDeBasto anchoDeBasto = new AnchoDeBasto();
        SieteDeEspadas sieteDeEspadas = new SieteDeEspadas();

        Ronda primerMano = new Ronda(anchoDeBasto, sieteDeEspadas);

        Assert.assertEquals(primerMano.ganador(), anchoDeBasto);
    }

    @Test
    public void test_el_ancho_de_basto_pierde_con_el_ancho_de_espadas() {
        AnchoDeBasto anchoDeBasto = new AnchoDeBasto();
        AnchoDeEspadas anchoDeEspadas = new AnchoDeEspadas();

        Ronda primerMano = new Ronda(anchoDeBasto, anchoDeEspadas);

        Assert.assertEquals(primerMano.ganador(), anchoDeEspadas);
    }

    @Test
    public void test_se_tienen_dos_conjuntos_de_cartas_gana_el_envido_el_segundo_conjunto() {
        AnchoDeEspadas anchoDeEspadas = new AnchoDeEspadas();
        SieteDeEspadas sieteDeEspadas = new SieteDeEspadas();
        CuatroDeCopa cuatroDeCopa = new CuatroDeCopa();

        AnchoDeBasto anchoDeBasto = new AnchoDeBasto();
        SieteDeOro sieteDeOro = new SieteDeOro();
        CincoDeOro cincoDeOro = new CincoDeOro();

        Mano mano = new Mano(anchoDeBasto, sieteDeOro, cincoDeOro);

        Mano segundaMano = new Mano(anchoDeEspadas, sieteDeEspadas, cuatroDeCopa);

        Envido envidoGanador = mano.desafiarEnvido(segundaMano);

        Assert.assertTrue(envidoGanador.equals( new Envido(new SieteDeOro(), new CincoDeOro()) ) );
    }
}
