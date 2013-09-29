package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}



	@Test
	public void quePiedraRompaTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra rompe tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	
	@Test
	public void queLagartoEmpate() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagartos empatan", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoComaPapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto se come el papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockEmpate() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spocks empatan", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraDecapiteLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto es decapitado", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePapelDesapruebeSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel desaprueba a Spock", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockVaporicePiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	
}
