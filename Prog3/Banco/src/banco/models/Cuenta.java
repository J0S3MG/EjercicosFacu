package banco.models;

import java.util.Vector;

public class Cuenta {

	private static int nroC = 0;
	private Cliente c;
	private Vector<Transaccion> lisTrans = new Vector<>();
	private double saldo;
	//Getters
	public double getSaldo() {
		return saldo;
	}
	//Methods
	public Cuenta(Cliente c, double s) {
		this.c = c;
		saldo = s;
		nroC++;
	}
	public void addTransaccion(Transaccion t) {
		if( t instanceof Deposito) {
			t = new Deposito(t.getMonto());
			saldo += t.getMonto();
		}
		else if(t instanceof Extraccion){
			t = new Extraccion(t.getMonto());
			saldo -= t.getMonto();
		}
	}
}
