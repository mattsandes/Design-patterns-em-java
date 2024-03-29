package factoryMethod.factories;

import factoryMethod.models.Jogador;

public class JogadorFactory {

	public Jogador createJogador() {
		return new Jogador();
	}
}
