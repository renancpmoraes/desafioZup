package enumeral;

/** Teste de programa��o Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public enum Orientacao {
	
	
	/* Organiza��o das orienta��es, colocando valores e facilitando na estrutura��o do programa.
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
