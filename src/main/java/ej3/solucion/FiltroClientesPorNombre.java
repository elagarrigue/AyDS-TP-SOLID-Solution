package ej3.solucion;

import java.util.ArrayList;
import java.util.List;

public class FiltroClientesPorNombre implements FiltroClientes {

	private String nombre;
	
	public FiltroClientesPorNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public List<Cliente> filtrar(List<Cliente> clientes) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.nombre == nombre) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}

}
