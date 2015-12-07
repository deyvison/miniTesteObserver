package ufpb.aps.central;

import java.util.ArrayList;
import java.util.List;

public class CentralTelefonica {
	
	private List <CentralListener> listeners;
	
	
	public CentralTelefonica(){
		this.listeners = new ArrayList<CentralListener>();
	}
	
	public void novaChamada(Sinal sinal){
		this.notificar(sinal);
		
	}
	
	private void notificar(Sinal sinal){
		CentralEvent ce = new CentralEvent(this,sinal);
		for(CentralListener c : this.listeners){
			c.novoEvento(ce);
		}
		
	}
	
	public void add(CentralListener c){
		this.listeners.add(c);
	}
}
