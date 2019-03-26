package ej3.solucion;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {
	
	private List<Cliente> clientes =  new ArrayList<Cliente>();

	public List<Cliente> getClientes() {
		return clientes;
	}

	// ...
	
	public List<Cliente> getClientesPorFiltro(FiltroClientes filtro) {
		return filtro.filtrar(clientes);
	}
	
	
	// ...
}
