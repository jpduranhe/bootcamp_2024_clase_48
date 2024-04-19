package clase_48.calculadora.calcular;

import clase_48.calculadora.model.CalculoHistorico;
import clase_48.calculadora.persistencia.PersisteHistorico;

public abstract class Calculator {

	private PersisteHistorico persistidor;
	
	
	public Calculator(PersisteHistorico persistidor) {
		this.persistidor = persistidor;
	}

	protected void guardarHistorial(CalculoHistorico calculoHistorico) {
		persistidor.guardar(calculoHistorico);
	}
	
	public abstract double sumar(double num1,double num2);
	public abstract double restar(double num1,double num2);
	public abstract double multiplicar(double num1,double num2);
	public abstract double dividir(double num1,double num2);
}
