package factoryMethod.factories;

import factoryMethod.models.Piloto;

public class PilotoFactory {

	public Piloto createPiloto() {
		return new Piloto();
	}
}
