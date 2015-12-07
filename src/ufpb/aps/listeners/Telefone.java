package ufpb.aps.listeners;

import ufpb.aps.central.CentralEvent;
import ufpb.aps.central.CentralListener;
import ufpb.aps.central.TipoSinal;

public class Telefone implements CentralListener {

	@Override
	public void novoEvento(CentralEvent evento) {
		
		if(evento.getSinal().getTipo() == TipoSinal.VOZ){
			tocar();
		}

	}
	
	private void tocar(){
		System.out.println("Trim trim trim..");
	}

}
