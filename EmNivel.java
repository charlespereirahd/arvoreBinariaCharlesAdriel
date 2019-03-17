package arvore_binaria;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmNivel implements IPercorre{
	
	@Override
	public void percorre(Nodo nodo) {
		
		/**
		 * Cria a lista Deque 
		 * 
		 * Lista que tem mais possibilidades de uso:
		 * 		Pode pegar ites do topo ou debaixo
		 * 		removeFirst que pega o item e remove ele da lista
		 */
		Deque<Nodo> fila = new ArrayDeque<>();
		
		//Adiciono o primeiro nodo a fila para iniciar a leitura
		fila.addLast(nodo);
		
		while (!fila.isEmpty()) {
			
			//Atribuo o topo da fila ao meu nodo atual, removo ele da fila e exibo seu valor
			Nodo nivelAtual = fila.removeFirst();
			System.out.println("Valor: "+nivelAtual.getValor());
			
			//Adiciono os nodos que estao abaixo na fila
			if (nivelAtual.getEsquerda() != null)
				fila.add(nivelAtual.getEsquerda());
			
			if (nivelAtual.getDireita() != null)
				fila.add(nivelAtual.getDireita());
		}
		
	}

}