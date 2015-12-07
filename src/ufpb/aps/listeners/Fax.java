package ufpb.aps.listeners;

import ufpb.aps.central.CentralEvent;
import ufpb.aps.central.CentralListener;
import ufpb.aps.central.TipoSinal;

public class Fax implements CentralListener {

	@Override
	public void novoEvento(CentralEvent evento) {
		
		if(evento.getSinal().getTipo() == TipoSinal.FAX){
			conectar();
		}
				

	}
	public void conectar(){
		System.out.println("Fax conectado!");
	}

}
