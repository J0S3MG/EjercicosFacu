package impresora.models;

import java.util.Date;

public class Mensaje {

	private Date fecha;
	private Header hdr;
	private Body bdy;
	private Footer ftr;
	
	public Mensaje(Header h,Body b,Footer f) {
		hdr = h;
		bdy = b;
		ftr = f;
	}

	@Override
	public String toString() {
		return hdr.getMsjH() + "\n"+ "---------------------" + "\n" + bdy.getT().getText() + "\n"+ "---------------------"+"\n" + ftr.getMsjF()+ "\n"+ "---------------------";
	}

	public Header getHdr() {
		return hdr;
	}

	public Body getBdy() {
		return bdy;
	}

	public Footer getFtr() {
		return ftr;
	}
	
	
}
