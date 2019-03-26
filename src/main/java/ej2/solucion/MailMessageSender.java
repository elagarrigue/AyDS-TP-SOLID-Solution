package ej2.solucion;

public class MailMessageSender {

  public void enviar(Mail mail) {
    ConexionMail conexionMail = ConexionMail.getInstance();
    try {
      conexionMail.enviar(mail);
    } finally {
      if (conexionMail != null)
        conexionMail.cerrar();
    }
  }
}
