package ej2.solucion;

public class AuditTransfMonet {

  private final MailMessageSender sender = new MailMessageSender();

  public AuditTransfMonet() {
  }

  public void transferenciaRealizada(Transferencia transferencia) {
    if (esTransferenciaImportante(transferencia)) {
      String auditor = obtenerDireccionMailAuditor();
      String mensaje = componerMensajeAviso(transferencia);
      enviarMensaje(auditor, mensaje);
    }
  }

  private boolean esTransferenciaImportante(Transferencia transferencia) {
    return transferencia.importe() > 50000;
  }

  private String obtenerDireccionMailAuditor() {
    return "mail-auditor";
  }

  private String componerMensajeAviso(Transferencia transferencia) {
    return "aviso-transferencia-importante";
  }

  private void enviarMensaje(String auditor, String mensaje) {
    sender.enviar(new Mail().to(auditor).withBody(mensaje));
  }
}
