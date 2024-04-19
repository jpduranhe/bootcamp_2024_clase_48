package clase_48.calculadora.persistencia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase_48.calculadora.model.CalculoHistorico;

public class PersistidorHistoricoTest {
	
	PersistidorList persistidorList;
	@BeforeEach
	void setUp() {
		persistidorList= new PersistidorList();
	}

	@Test
	public void testAgregarHsitorico() {
		CalculoHistorico calcuHisotico= new CalculoHistorico("Sumar",2,1,1);
		persistidorList.guardar(calcuHisotico);
		List<CalculoHistorico>  listado=persistidorList.obtenerListado();
		int cantidadRegistroListado= listado.size();
		assertEquals(1,cantidadRegistroListado);
	}

}
