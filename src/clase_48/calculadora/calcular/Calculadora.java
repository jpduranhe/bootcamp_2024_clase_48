package clase_48.calculadora.calcular;

import clase_48.calculadora.model.CalculoHistorico;
import clase_48.calculadora.persistencia.PersisteHistorico;

public class Calculadora extends Calculator {

	public Calculadora(PersisteHistorico persistidor) {
		super(persistidor);
	}

	@Override
	public double sumar(double num1, double num2) {
		double resultado= num1+num2;		
		procesaHistorico("Sumar",resultado,num1,num2);	
		return resultado;
	}

	@Override
	public double restar(double num1, double num2) {
		double resultado= num1-num2;		
		procesaHistorico("Resta",resultado,num1,num2);	
		return resultado;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		double resultado= num1*num2;		
		procesaHistorico("Multiplica",resultado,num1,num2);	
		return resultado;
	}

	@Override
	public double dividir(double num1, double num2) {
		double resultado= num1/num2;		
		procesaHistorico("Divide",resultado,num1,num2);	
		return resultado;
	}
	
	private void procesaHistorico(String op,double resultado, double num1,double num2) {
		CalculoHistorico objCalculoHistorico= new CalculoHistorico(op,resultado,num1,num2);	
		guardarHistorial(objCalculoHistorico);
	}
	
	
	
	

}
