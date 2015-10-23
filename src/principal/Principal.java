package principal;

import enumeral.Orientacao;
import rover.Rover;


/** Teste de programação Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public class Principal {		    
	
    public static void main(String args[]) {
    	
        Rover rover1 = new Rover(); // Instanciando o Rover 1
        Rover rover2 = new Rover(); // Instanciando o Rover 2
        
        // Rover 1
        rover1.setPosicao(1, 2,Orientacao.N.valor);  // Posição do Rover1
        rover1.executarComando("LMLMLMLMM");        // Comandos que o Rover1 vai seguir
        System.out.println(rover1.imprimePosicaoRover());    // Imprime o resultado do comando    
        
        
        // Rover 2
        rover2.setPosicao(3, 3,Orientacao.L.valor);  // Posição do Rover2 
        rover2.executarComando("MMRMMRMRRM");		// Comandos que o Rover2 vai seguir
        System.out.println(rover2.imprimePosicaoRover()); // Imprime o resultado do comando
    }
    
	

}
