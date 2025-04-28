package banco.models;

import java.util.Vector;

public class Banco {

	private String nom;
	private double banca;
	private Vector<Cliente> listCli = new Vector<>();
	public Banco(String n) {
		nom = n;
	}
	public double getDispBanco() {
		for (Cliente c : listCli) {
			banca += c.getResumenCuenta(); 
		}
		return banca;
	}
}
