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
	public void test_se_solicita_un_aula_con_capacidad_para_10_personas_devuelve_aula_b() {
		AulaConcreta laboB = new AulaConcreta("Lab B", 15);
		AulaConcreta laboA = new AulaConcreta("Lab A", 5);

		ListadoDeAulas aulas = new ListadoDeAulas();
		aulas.add(laboB);
		aulas.add(laboA);

		Solicitud solicitud = new Solicitud(10);

		Aula aulaAsignada = aulas.solicitarAula(solicitud);

		Assert.assertEquals( aulaAsignada, laboB);
		Assert.assertEquals( aulaAsignada.obtenerEtiqueta(), "Aula: Lab B");
	}

	@Test
	public void test_se_solicita_un_aula_con_capacidad_para_30_personas_devuelve_no_hay_aula() {
		AulaConcreta laboB = new AulaConcreta("Lab B", 15);
		AulaConcreta laboA = new AulaConcreta("Lab A", 5);

		ListadoDeAulas aulas = new ListadoDeAulas();
		aulas.add(laboB);
		aulas.add(laboA);

		Solicitud solicitud = new Solicitud(30);

		Aula aulaAsignada = aulas.solicitarAula(solicitud);

		Assert.assertEquals( aulaAsignada.getClass(), NingunAula.class);
		Assert.assertEquals( aulaAsignada.obtenerEtiqueta(), "No hay aula disponible");
	}

	@Test
	public void test_se_solicita_un_aula_con_capacidad_para_10_personas_y_30_m2_devuelve_aula_c() {
		AulaConcreta laboA = new AulaConcreta("Lab A", 5, 10);
		AulaConcreta laboB = new AulaConcreta("Lab B", 15, 20);
		AulaConcreta laboC = new AulaConcreta("Lab C", 15, 50);

		ListadoDeAulas aulas = new ListadoDeAulas();
		aulas.add(laboA);
		aulas.add(laboB);
		aulas.add(laboC);

		Solicitud solicitud = new Solicitud(10, 30);

		Aula aulaAsignada = aulas.solicitarAula(solicitud);

		Assert.assertEquals( aulaAsignada, laboC);
		Assert.assertEquals( aulaAsignada.obtenerEtiqueta(), "Aula: Lab C");
	}
}
