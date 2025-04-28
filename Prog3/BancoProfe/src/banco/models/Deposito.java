package banco.models;

import java.util.Date;

public class Deposito extends Transaccion{

	private Date fechaDeposito;

	public Date getFechaDeposito() {
		return fechaDeposito;
	}

	public void setFechaDeposito(Date fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	
}
