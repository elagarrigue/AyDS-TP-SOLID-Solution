
import static org.junit.Assert.assertEquals;

import ej4.solucion.NotificarPorMail;
import ej4.solucion.Orden;
import ej4.solucion.ProcesadorDeOrdenes;
import ej4.solucion.RepositorioOrdenesImpl;
import org.junit.Test;


public class Ej4SolucionTest {

  @Test
  public void test() {

    ProcesadorDeOrdenes procesador =
            new ProcesadorDeOrdenes(
                    NotificarPorMail.getInstance(),
                    new RepositorioOrdenesImpl()
            );
    assertEquals(NotificarPorMail.getInstance().ordenes.size(), 0);

    procesador.procesar(new Orden());

    assertEquals(NotificarPorMail.getInstance().ordenes.size(), 1);
  }

}
