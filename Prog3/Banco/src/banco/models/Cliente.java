package banco.models;
import java.util.Vector;

public class Cliente {

	private String ape;
	private String nom;
	private static int nroCli = 0;
	private Vector<Cuenta> lisCuenta = new Vector<>();
	
	//Methods
	public Cliente(String a,String n) {
		ape = a;
		nom = n;
		nroCli++;
	}
	public void addCuenta(Cuenta c) {
		lisCuenta.add(c);
	}
	public double getResumenCuenta() {
		double ts = 0;
		for (Cuenta cuenta : lisCuenta) {
			ts += cuenta.getSaldo();
		}
		return ts;
	}
}
