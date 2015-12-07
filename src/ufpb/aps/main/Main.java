package ufpb.aps.main;

import ufpb.aps.central.CentralTelefonica;
import ufpb.aps.central.Sinal;
import ufpb.aps.central.TipoSinal;
import ufpb.aps.listeners.Fax;
import ufpb.aps.listeners.Telefone;

public class Main {

	public static void main(String[] args) {

		CentralTelefonica central = new CentralTelefonica();
		
		Telefone t = new Telefone();
		Fax f = new Fax();

		central.add(t);
		central.add(f);
		
		central.novaChamada(new Sinal(TipoSinal.VOZ));
		central.novaChamada(new Sinal(TipoSinal.FAX));
	}

}
