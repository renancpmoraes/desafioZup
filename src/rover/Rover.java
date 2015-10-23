package rover;

import enumeral.Orientacao;


/** Teste de programa��o Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public class Rover {
    
	// Rover est� na parte inferior do canto esquerdo e voltado para o Norte.
    private Integer x = 0;
    private Integer y = 0;
    private Integer orientacao = Orientacao.N.valor;
    
          
    // Recebe a localiza��o do Rover e o lado do visor
    public void setPosicao(Integer x, Integer y, Integer orientacao) {
        this.x = x;
        this.y = y;
        this.orientacao = orientacao;
    }
    
    
    // Recebe um comando e o Rover executa 
    public void executarComando(String comandos) {
    	Object comando;		    	
        for (int i = 0; i < comandos.length(); i++) {
            comando = comandos.charAt(i); // L� cada caractere da sequencia de comando
            
            if (comando.equals('L')) { // Se o comando for Esquerda
                vireEsquerda();
            } else if (comando.equals('R')) { // Se o comando for Direita
                vireDireita();
            } else if (comando.equals('M')) { // Se o comando for Mover o Rover
                moverRover();
            }
        }
    }
    
    // Movimentar o Rover
    private void moverRover() {
        if (orientacao == Orientacao.N.valor) { // Se dire��o NORTE, incrementa a coordenada Y
            this.y++;
        } else if (orientacao == Orientacao.L.valor) { // Se dire��o LESTE, incrementa a coordenada X
            this.x++;
        } else if (orientacao == Orientacao.S.valor) { // Se dire��o SUL, decrementa a coordenada Y
            this.y--;
        } else if (orientacao == Orientacao.O.valor) { // Se dire��o OESTE, decrementa a coordenada X
            this.x--;
        }
    }
       
    // Rover vira a esquerda
    private void vireEsquerda() {
    	if(orientacao - 1 < Orientacao.N.valor){ // Se a orienta��o j� estiver pro NORTE (orienta��o n�o pode ficar negativa)
    		orientacao = Orientacao.O.valor; // Orienta��o recebe OESTE
    	}
    	else
    		orientacao = orientacao - 1; // Se n�o, decrementa o valor de Orienta��o   	      
    }
    
    // Rover vira a direita
    private void vireDireita() {
    	
    	if(orientacao + 1 > Orientacao.O.valor){ // Se a orienta��o j� estiver pro OESTE (orienta��o n�o pode ficar  > 4)
    		orientacao = Orientacao.N.valor; // Orienta��o recebe NORTE
    	}
    	else
    		orientacao = orientacao +1; // Se n�o, incrementa o valor de Orienta��o       		
    }
    
    
 // Imprimindo a posicao onde o Rover se encontra    
    public String imprimePosicaoRover() {
        
    	char direcao = 'N'; 
            	
    	// Formando a resposta de acordo com o valores das coordenadas X,Y(j� calculadas no executarComandos) e da dire��o.
        if (orientacao == 1) {
            direcao = 'N';
        } else if (orientacao == 2) {
            direcao = 'L';
        } else if (orientacao == 3) {
            direcao = 'S';
        } else if (orientacao == 4) {
            direcao = 'O';
        }
        return x+" "+y+" "+direcao;        
    }  
	
}
