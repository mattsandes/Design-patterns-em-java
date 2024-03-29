package factoryMethod.models;

import factoryMethod.factories.JogadorFactory;
import factoryMethod.factories.ProgramadorFactory;
import factoryMethod.interfaces.Pessoa;

public class Main {
	public static void main(String[] args) {
		
		//criando o tipo programador sem instanciar;
		ProgramadorFactory factory = new ProgramadorFactory();
		
		Pessoa pessoa = factory.createProgramador();
		
		System.out.println(pessoa);
		
		//criando o tipo jogador sem instanciar;
		JogadorFactory jFactory = new JogadorFactory();
		
		pessoa = jFactory.createJogador();
		
		System.out.println(pessoa);
	}
}
