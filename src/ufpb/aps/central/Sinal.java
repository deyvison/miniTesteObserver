package ufpb.aps.central;

public class Sinal {
	
	private TipoSinal tipo;
	
	public Sinal(TipoSinal tipo){
		this.tipo = tipo;
	}
	
	public TipoSinal getTipo(){
		return this.tipo;
	}
}
