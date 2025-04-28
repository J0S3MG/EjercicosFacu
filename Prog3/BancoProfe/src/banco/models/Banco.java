package banco.models;

import java.util.Vector;

public class Banco {
	private String nombre;
	private Vector<Cuenta> cuentas=new Vector<>();
	private Vector<Cliente> listaClientes=new Vector<>();
	
	public float getDisponibleEnBanco() {
		float total=0;
		for (Cuenta cuenta : cuentas) {
			total+=cuenta.getSaldo();
		}
		return total;
	}
    /////////////////////////////////////////////////////
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Vector<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(Vector<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	public Vector<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(Vector<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
