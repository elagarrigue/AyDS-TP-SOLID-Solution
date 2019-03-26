package ej4.solucion;

import java.util.ArrayList;
import java.util.List;

public class NotificarPorMail implements NotificadorOrdenes {

	private static NotificarPorMail instance;

	private NotificarPorMail() {
	}

	public static NotificarPorMail getInstance() {
		if (instance == null) {
			instance = new NotificarPorMail();
		}
		return instance;
	}

	public List<Orden> ordenes = new ArrayList<Orden>();

	public void enviarMensajeDeConfirmacion(Orden orden) {
		ordenes.add(orden);
	}

}
