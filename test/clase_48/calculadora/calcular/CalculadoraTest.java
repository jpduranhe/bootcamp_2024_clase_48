package clase_48.calculadora.calcular;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import clase_48.calculadora.model.CalculoHistorico;
import clase_48.calculadora.persistencia.PersisteHistorico;


public class CalculadoraTest {
	
	Calculator calculator;
	PersisteHistorico persistidor;
	
	CalculadoraTest(){
		MockitoAnnotations.initMocks(this);
	}

	@BeforeEach
	void setUp() throws Exception {
		persistidor= Mockito.mock(PersisteHistorico.class);
		Mockito.doNothing().when(persistidor).guardar(any(CalculoHistorico.class));		
		calculator= new Calculadora(persistidor);
		
	}

	@Test
	@DisplayName("Test metodo sumar")
	void testSumar() {
		
		double resultado=calculator.sumar(1, 3);
		assertEquals(4,resultado,0.1);	
	}
	@Test
	@DisplayName("Test metodo sumar guarda el historio")
	void testSumarGuardaHistorico() {		
		calculator.sumar(1, 3);
		verify(persistidor).guardar(any(CalculoHistorico.class));
	}

}
