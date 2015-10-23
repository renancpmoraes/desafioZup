package testeJunit;

import static org.junit.Assert.*;
import org.junit.*;

import enumeral.Orientacao;
import rover.Rover;

/**Teste de programa��o Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public class RoverTest {

	@Test
	public void testPosicao() {
		
		Rover teste1 = new Rover(); // Criando uma instancia��o para o Teste
		
		teste1.setPosicao(1, 2,Orientacao.N.valor); // Posi��o do Teste1       
        teste1.executarComando("LMLMLMLMM");    // Comandos que o Teste1 vai seguir   
        assertEquals("1 3 N",teste1.imprimePosicaoRover()); // Metodo para a realiza��o do teste ( faz a compara��o do resultado).     
        
        
        
        Rover teste2 = new Rover(); // Criando uma instancia��o para o Teste2      
		
		teste2.setPosicao(3, 3,Orientacao.L.valor);   // Posi��o do Teste2     
        teste2.executarComando("MMRMMRMRRM");        // Comandos que o Teste2 vai seguir   
        assertEquals("5 1 L",teste2.imprimePosicaoRover()); // Metodo para a realiza��o do teste ( faz a compara��o do resultado).  
        
		
	}

}
