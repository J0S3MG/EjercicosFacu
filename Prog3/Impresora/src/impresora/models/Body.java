package impresora.models;

import java.util.Vector;

public class Body {

	private Titulo t;
	private Vector<Parrafo> parrafos = new Vector<>();
	
	public Body(Titulo t) {
		this.t = t;
	}
	public Titulo getT() {
		return t;
	}
	public Parrafo getP(int idx) {
		return parrafos.elementAt(idx);
	}

	public void addParrafos(Parrafo p) {
		parrafos.add(p);
	}
}
