package banco.models;

import java.util.Vector;

public class Cliente {

	private String apellido;
	private String nombre;
	private int clienteNro;
	private Vector<Cuenta> cuentas;
	private Banco banco;
	
	public Cliente(Banco banco) {
		this.cuentas = new Vector<>();
		this.banco=banco;
		banco.getListaClientes().add(this);
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);
		this.banco.getCuentas().add(cuenta);
	}
	/////////////////////////////////////////////////////
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getClienteNro() {
		return clienteNro;
	}
	public void setClienteNro(int clienteNro) {
		this.clienteNro = clienteNro;
	}
	public Vector<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(Vector<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
}
