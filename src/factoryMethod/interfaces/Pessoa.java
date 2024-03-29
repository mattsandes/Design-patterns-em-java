package factoryMethod.interfaces;

public abstract class Pessoa {
	
	String profissao;
	
	public void estaViva() {
		System.out.println("Estou vivo");
	}
	
	public void estaEmpregado() {
		System.out.println("Estou trabalhando");
	}
}
