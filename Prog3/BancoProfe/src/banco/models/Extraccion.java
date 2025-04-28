package banco.models;

import java.util.Date;

public class Extraccion extends Transaccion{

	private Date fechaExtracción;

	public Date getFechaExtracción() {
		return fechaExtracción;
	}

	public void setFechaExtracción(Date fechaExtracción) {
		this.fechaExtracción = fechaExtracción;
	}
	
}
