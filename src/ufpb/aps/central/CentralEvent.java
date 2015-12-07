package ufpb.aps.central;

public class CentralEvent {
	
	
	private Sinal sinal;
	private CentralTelefonica source;
	
	public CentralEvent(CentralTelefonica centralTelefonica, Sinal sinal) {
		this.source = centralTelefonica;
		this.sinal = sinal;
	}
	
	public Sinal getSinal(){
		return this.sinal;
	}
	
	public CentralTelefonica getSource(){
		return this.source;
	}
}
