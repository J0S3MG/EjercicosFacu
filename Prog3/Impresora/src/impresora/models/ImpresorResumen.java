package impresora.models;

public class ImpresorResumen implements Impresor {

	public void impMensaje(Mensaje msj) {
	    System.out.println(msj.toString());
	}
}
