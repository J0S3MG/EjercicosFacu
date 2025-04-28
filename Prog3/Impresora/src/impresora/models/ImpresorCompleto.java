package impresora.models;

public class ImpresorCompleto implements Impresor {

	public void impMensaje(Mensaje msj) {
		System.out.println("                    ");
		System.out.println(msj.getHdr().getMsjH());
		System.out.println("                    ");
		System.out.println(msj.getBdy().getT().getText());
		System.out.println("                    ");
		System.out.println(msj.getBdy().getP(0).getTexto());
		System.out.println("                    ");
		System.out.println(msj.getBdy().getP(1).getTexto());
		System.out.println("                    ");
		System.out.println(msj.getFtr().getMsjF());
		System.out.println("                    ");
	}

}
