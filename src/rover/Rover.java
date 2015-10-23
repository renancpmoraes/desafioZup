package rover;

import enumeral.Orientacao;


/** Teste de programação Backend - Zup
 * 
 * @author RenanCarlos
 *
 */

public class Rover {
    
	// Rover está na parte inferior do canto esquerdo e voltado para o Norte.
    private Integer x = 0;
    private Integer y = 0;
    private Integer orientacao = Orientacao.N.valor;
    
          
    // Recebe a localização do Rover e o lado do visor
    public void setPosicao(Integer x, Integer y, Integer orientacao) {
        this.x = x;
        this.y = y;
        this.orientacao = orientacao;
    }
    
    
    // Recebe um comando e o Rover executa 
    public void executarComando(String comandos) {
    	Object comando;		    	
        for (int i = 0; i < comandos.length(); i++) {
            comando = comandos.charAt(i); // Lê cada caractere da sequencia de comando
            
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
        if (orientacao == Orientacao.N.valor) { // Se direção NORTE, incrementa a coordenada Y
            this.y++;
        } else if (orientacao == Orientacao.L.valor) { // Se direção LESTE, incrementa a coordenada X
            this.x++;
        } else if (orientacao == Orientacao.S.valor) { // Se direção SUL, decrementa a coordenada Y
            this.y--;
        } else if (orientacao == Orientacao.O.valor) { // Se direção OESTE, decrementa a coordenada X
            this.x--;
        }
    }
       
    // Rover vira a esquerda
    private void vireEsquerda() {
    	if(orientacao - 1 < Orientacao.N.valor){ // Se a orientação já estiver pro NORTE (orientação não pode ficar negativa)
    		orientacao = Orientacao.O.valor; // Orientação recebe OESTE
    	}
    	else
    		orientacao = orientacao - 1; // Se não, decrementa o valor de Orientação   	      
    }
    
    // Rover vira a direita
    private void vireDireita() {
    	
    	if(orientacao + 1 > Orientacao.O.valor){ // Se a orientação já estiver pro OESTE (orientação não pode ficar  > 4)
    		orientacao = Orientacao.N.valor; // Orientação recebe NORTE
    	}
    	else
    		orientacao = orientacao +1; // Se não, incrementa o valor de Orientação       		
    }
    
    
 // Imprimindo a posicao onde o Rover se encontra    
    public String imprimePosicaoRover() {
        
    	char direcao = 'N'; 
            	
    	// Formando a resposta de acordo com o valores das coordenadas X,Y(já calculadas no executarComandos) e da direção.
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
