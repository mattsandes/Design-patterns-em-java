package factoryMethod.models;

import factoryMethod.factories.JogadorFactory;
import factoryMethod.factories.PilotoFactory;
import factoryMethod.factories.ProgramadorFactory;
import factoryMethod.interfaces.Pessoa;

public class Main {
	public static void main(String[] args) {
		
		//criando o tipo programador sem instanciar;
		ProgramadorFactory factory = new ProgramadorFactory();
		JogadorFactory jFactory = new JogadorFactory();
		PilotoFactory pFactory = new PilotoFactory();
		
		Pessoa pessoa = factory.createProgramador();
		
		System.out.println(pessoa);
		
		//criando o tipo jogador sem instanciar;
		
		pessoa = jFactory.createJogador();
		
		System.out.println(pessoa);
		
		//Criando um pilot sem precisar instanciar;
		pessoa = pFactory.createPiloto();
		
		System.out.println(pessoa);
		
	}
}
