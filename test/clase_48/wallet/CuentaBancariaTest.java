package clase_48.wallet;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import clase_48.calculadora.wallet.CuentaBancaria;

public class CuentaBancariaTest {
	
	
	@Test
	void saldoInicialDeberiaSerCero() {
		CuentaBancaria cuenta= new CuentaBancaria();
		assertEquals(0,cuenta.getSaldo());
	}
	
	@Test
	void depositarDeberiaAumentarElSaldo() {
		CuentaBancaria cuenta= new CuentaBancaria();
		cuenta.depositar(100);
		assertEquals(100,cuenta.getSaldo());
	}
	@Test
	void retirarDeberiaReducirElSaldo() {
		CuentaBancaria cuenta= new CuentaBancaria(200);
		cuenta.retirar(50);
		assertEquals(150,cuenta.getSaldo());
	}
	
	@Test
	void retirarNoDebeOcurrirSiElSaldoNoEsSufciente() {
		CuentaBancaria cuenta= new CuentaBancaria(200);
		cuenta.retirar(500);
		assertEquals(200,cuenta.getSaldo());
	}
	
}
