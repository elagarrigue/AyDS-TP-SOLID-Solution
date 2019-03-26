package ej3.solucion;

import java.util.ArrayList;
import java.util.List;

public class FiltroClientesConSaldo implements FiltroClientes {

	public List<Cliente> filtrar(List<Cliente> clientes) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.saldo > 0) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}
}
