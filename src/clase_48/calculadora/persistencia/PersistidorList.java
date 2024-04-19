package clase_48.calculadora.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clase_48.calculadora.model.CalculoHistorico;
@RunWith(Suite.class)
public class PersistidorList implements PersisteHistorico{
	
	private List<CalculoHistorico> listado= new ArrayList();

	@Override
	public void guardar(CalculoHistorico calculoHistorico) {
		listado.add(calculoHistorico);
		
	}

	@Override
	public List<CalculoHistorico> obtenerListado() {
		return listado;
	}

	@Override
	public CalculoHistorico obtenerHistorico(int posicion) {
		return listado.get(posicion);
	}

}
