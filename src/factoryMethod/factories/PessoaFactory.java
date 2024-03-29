package factoryMethod.factories;

import factoryMethod.interfaces.Pessoa;
import factoryMethod.models.Jogador;
import factoryMethod.models.Programador;

public class PessoaFactory {
	
	private Pessoa pessoa = null;

	public Pessoa criar (String tipo) {
		if(tipo.equals("jogador")) {
			pessoa = new Jogador();
		}
		
		if(tipo.equals("programador")) {
			pessoa = new Programador();
		}
		
		return pessoa;
	}
}
