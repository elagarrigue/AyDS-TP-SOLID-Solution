package ej3.solucion;

import java.util.ArrayList;
import java.util.List;

public class FiltroClientesPorLocalidad implements FiltroClientes {
	
	private Localidad localidad;
	
	public FiltroClientesPorLocalidad(Localidad localidad) {
		super();
		this.localidad = localidad;
	}

	@Override
	public List<Cliente> filtrar(List<Cliente> clientes) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.localidad == localidad) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}

}
