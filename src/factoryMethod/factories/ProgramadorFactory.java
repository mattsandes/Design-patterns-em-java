package factoryMethod.factories;

import factoryMethod.models.Programador;

public class ProgramadorFactory {
	
	public Programador createProgramador() {
		
		return new Programador();
		
	}
}
