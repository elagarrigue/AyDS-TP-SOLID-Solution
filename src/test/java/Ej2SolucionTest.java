
import static org.junit.Assert.*;

import ej2.solucion.*;
import org.junit.Test;

public class Ej2SolucionTest {

	@Test
	public void test() {
		
		Transferencia transferencia = new Transferencia(100000);
		AuditTransfMonet auditTransfMonet = new AuditTransfMonet();
		
		assertEquals(ConexionMail.getInstance().getQueue().size(), 0);
		
		auditTransfMonet.transferenciaRealizada(transferencia);
		
		assertEquals(ConexionMail.getInstance().getQueue().size(), 1);
		
		Mail expectedMail = ConexionMail.getInstance().getQueue().get(0);

		assertEquals(expectedMail.getAuditor(),"mail-auditor");
		assertEquals(expectedMail.getMensaje() ,"aviso-transferencia-importante");
	}

}
