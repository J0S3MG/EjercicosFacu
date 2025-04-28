package banco.models;

import java.util.Vector;

public class Cuenta {
  
	private int nroCuenta;
	private Cliente cliente;
	private float saldo;
	private Vector<Transaccion> listaTrans = new Vector<>();
	
	public void addTransacción(Transaccion trx) {
		this.saldo+=(trx instanceof Deposito)?trx.getMonto():(-1)*trx.getMonto();
	}
    /////////////////////////////////////////////////////
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Vector<Transaccion> getListaTrans() {
		return listaTrans;
	}
	public void setListaTrans(Vector<Transaccion> listaTrans) {
		this.listaTrans = listaTrans;
	}
}
