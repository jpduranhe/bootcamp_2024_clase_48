package clase_48.calculadora.wallet;

public class CuentaBancaria {

	private int saldo;
	
	public CuentaBancaria() {
		this.saldo=0;
	}
	public CuentaBancaria(int  montoInicial) {
		this.saldo=montoInicial;
	}
	
	
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void depositar(int monto){
		
		this.saldo+=monto;
	}
	public void retirar(int monto) {
		if(monto<=saldo) {
			this.saldo-=monto;			
		}
	}
}
