package banco.models;

public abstract class Transaccion {

	private double monto;
	
	public double getMonto() {
		return monto;
	}
	public Transaccion(double m) {
		monto = m;
	}

}
