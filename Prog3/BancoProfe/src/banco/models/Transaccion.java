package banco.models;

public abstract class Transaccion {

	protected float monto;

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
}
