package edu.tallerweb.pptls;


public class Mano {

	int valorForma;
	public Mano(final Forma forma) {
		this.valorForma = forma.getValor();
	}

	
	public Resultado jugarCon(final Mano otra) {
int resultado = (5 + this.valorForma- otra.valorForma) % 5;
		
		if (resultado == 1 || resultado == 3){
			return Resultado.GANA;
		}else if (resultado == 2 || resultado == 4){
			return Resultado.PIERDE;
		}else { 
			return Resultado.EMPATA;
	}

	}
}
