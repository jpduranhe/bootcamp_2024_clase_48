package clase_48.calculadora;

import org.junit.platform.suite.api.SelectMethod;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import clase_48.calculadora.calcular.CalculadoraTest;
import clase_48.calculadora.persistencia.PersistidorHistoricoTest;

@Suite
@SuiteDisplayName("Suit Test ProcesoVenta ")
//@SelectClasses({CalculadoraTest.class,PersistidorHistoricoTest.class})
@SelectMethod(type = PersistidorHistoricoTest.class, name = "testAgregarHsitorico")
@SelectMethod(type = CalculadoraTest.class, name = "testSumar")
public class SuiteTestCaluladora {

}
