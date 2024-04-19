package clase_48.calculadora.model;

public class CalculoHistorico {

	private String operacion;
	private double resultado;
	private double num1;
	private double num2;
	
	public CalculoHistorico(String operacion, double resultado, double num1, double num2) {
		this.operacion = operacion;
		this.resultado = resultado;
		this.num1 = num1;
		this.num2 = num2;
	}

	public String getOperacion() {
		return operacion;
	}

	public double getResultado() {
		return resultado;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	@Override
	public String toString() {
		return "CalculoHistorico [operacion=" + operacion + ", resultado=" + resultado + ", num1=" + num1 + ", num2="
				+ num2 + "]";
	}

	
	
	
}
