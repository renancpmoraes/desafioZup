package enumeral;

/** Teste de programação Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public enum Orientacao {
	
	
	/* Organização das orientações, colocando valores e facilitando na estruturação do programa.
	 * 
	 * N = Norte = 1
	 * L = Leste = 2
	 * S = Sul = 3
	 * O = Oeste = 4
	 */

	N(1),L(2),S(3),O(4);
	
	public Integer valor;
	
	Orientacao(Integer valor){
		this.valor = valor;
	}
	
}
