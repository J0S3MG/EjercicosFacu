package impresora.main;

import java.util.Vector;

import impresora.models.Body;
import impresora.models.Footer;
import impresora.models.Header;
import impresora.models.ImpresorCompleto;
import impresora.models.ImpresorResumen;
import impresora.models.Mensaje;
import impresora.models.Parrafo;
import impresora.models.Titulo;

public class Main {

	public static void main(String[] args) {
		Header h = new Header();
		h.setMsjH("Hola");
		Titulo t = new Titulo("Hey muy buenas!");
		Parrafo p1 = new Parrafo("Una ensalada de puñetazos");
		Parrafo p2 = new Parrafo("Abduzcan");
		Body b = new Body(t);
		b.addParrafos(p1);
		b.addParrafos(p2);
		Footer f = new Footer();
		f.setMsjF("Y chau");
		Mensaje msj = new Mensaje(h,b,f);
		ImpresorResumen imr = new ImpresorResumen();
		ImpresorCompleto imc = new ImpresorCompleto();
		imr.impMensaje(msj);
		imc.impMensaje(msj);
	}

}
