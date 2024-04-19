package clase_48.calculadora;

import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import clase_48.calculadora.calcular.CalculadoraTest;
import clase_48.calculadora.persistencia.PersistidorHistoricoTest;

@RunWith(Suite.class)
@SuiteDisplayName("Suit Test ProcesoVenta ")
@SuiteClasses(
		{CalculadoraTest.class,
		 PersistidorHistoricoTest.class})
//@SelectMethod(type = PersistidorHistoricoTest.class, name = "testAgregarHsitorico")
//@SelectMethod(type = CalculadoraTest.class, name = "testSumar")
public class SuiteTestCaluladora {

}
