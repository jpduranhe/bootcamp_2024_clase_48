package clase_48.calculadora.persistencia;

import java.util.List;

import clase_48.calculadora.model.CalculoHistorico;

public interface PersisteHistorico {

	void guardar(CalculoHistorico calculoHistorico);
	List<CalculoHistorico> obtenerListado();
	CalculoHistorico obtenerHistorico(int posicion);
}
