package ayds.tp1.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import ej3.solucion.*;

public class Ej3SolucionTest {

	@Test
	public void test() {
		
		Cliente clienteA = new Cliente();
		clienteA.nombre = "A";
		clienteA.localidad = Localidad.BAHIA_BLANCA;
		clienteA.saldo = 100;
		
		Cliente clienteB = new Cliente();
		clienteB.nombre = "B";
		clienteB.localidad = Localidad.NONE;
		clienteB.saldo = 0;
		
		Cliente clienteC = new Cliente();
		clienteC.nombre = "C";
		clienteC.localidad = Localidad.TRES_ARROYOS;
		clienteC.saldo = 200;

		LogicaClientes logicaClientes= new LogicaClientes();
		logicaClientes.getClientes().add(clienteA);
		logicaClientes.getClientes().add(clienteB);
		logicaClientes.getClientes().add(clienteC);
		
		List<Cliente> clientesBB = logicaClientes.getClientesPorFiltro(
				new FiltroClientesPorLocalidad(Localidad.BAHIA_BLANCA));
		
		assertEquals(clientesBB.size(), 1);
		assertEquals(clientesBB.get(0).nombre ,"A");
		
		List<Cliente> clientesB = logicaClientes.getClientesPorFiltro(new FiltroClientesPorNombre("B"));
		
		assertEquals(clientesB.size(), 1);
		assertEquals(clientesB.get(0).nombre ,"B");
		
		List<Cliente> clientesSaldo = logicaClientes.getClientesPorFiltro(new FiltroClientesConSaldo());
		
		assertEquals(clientesSaldo.size(), 2);
		assertEquals(clientesSaldo.get(0).nombre ,"A");
		assertEquals(clientesSaldo.get(1).nombre ,"C");
	}

}
