package banco.main;
import banco.models.Banco;
import banco.models.Cliente;
import banco.models.Cuenta;
import banco.models.Extraccion;
import banco.models.Transaccion;
public class Main {

	public static void main(String[] args) {
		Banco bna = new Banco();
		bna.setNombre("Banco Nacion");
		Cliente cli = new Cliente(bna);
		cli.setApellido("Gonzalez");
		cli.setNombre("Guido");
		Cuenta cta = new Cuenta();
		cta.setNroCuenta(101);
		cta.setCliente(cli);
		cta.setSaldo(500000);
		Transaccion tra = new Extraccion();
		tra.setMonto(100000);
		cta.addTransacción(tra);
		cli.agregarCuenta(cta);
		System.out.println("Arca: " + bna.getDisponibleEnBanco());

	}

}
