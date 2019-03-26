package ej4.solucion;

public class ProcesadorDeOrdenes {

	private final NotificadorOrdenes notificador;
	private final RepositorioOrdenes repositorio;
	
	public ProcesadorDeOrdenes(NotificadorOrdenes notificador, RepositorioOrdenes repositorio) {
		this.notificador = notificador;
		this.repositorio = repositorio;
	}

	public void procesar(Orden orden) {
		if (orden.Isvalid() && repositorio.grabar(orden)) {
			notificador.enviarMensajeDeConfirmacion(orden);
		}
	}
}
