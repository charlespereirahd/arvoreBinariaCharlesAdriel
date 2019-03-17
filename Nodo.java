package arvore_binaria;

public class Nodo {
	
	private int valor;
	private Nodo esquerda, direita;
	
	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}
	
	public void setDireita(Nodo direita) {
		this.direita = direita;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor (int valor) {
		this.valor = valor;
	}
	
	public Nodo getEsquerda() {
		return esquerda;
	}
	
	public Nodo getDireita() {
		return direita;
	}
	
	/**
	 * Construtor da classe
	 */
	
	public Nodo (int value) {
		this.valor = value;
	}
	
	/**
	 * Metodo recursivo de insere
	 */
	
	public boolean insere(int value) {
		if (value == this.valor) {
			System.out.println("Valor já existe na árvore.");
			return false;
		} else if (value < this.valor) {
			if (esquerda == null) {
				esquerda = new Nodo(value);
				System.out.println("Inserindo " + value + " a esquerda de " +this.valor);
				return true;
			}else
				return esquerda.insere(value);
			
		} else if (value > this.valor) {
			if (direita == null) {
				direita = new Nodo(value);
				System.out.println("Inserindo " + value + " a direita de "+this.valor);
				return true;
			} else
				return direita.insere(value);
		}
		return false;
	}
	
	public boolean deletar(int value, Nodo nodo) {
		if (value < this.valor) {
			if (esquerda != null)
				return esquerda.deletar(value, this);
			else
				return false;
		} else if (value > this.valor) {
			if (direita != null)
				return direita.deletar(value, this);
			else
				return false;
		}
		if (esquerda != null && direita != null) {
			this.valor = direita.MenorValorEsquerda();
			direita.deletar(this.valor, this);
		} else 
		if (nodo.esquerda == this) {
			if  (esquerda != null)
				nodo.esquerda = esquerda;
			else
				nodo.esquerda = direita;
			
		} else 
		if (nodo.direita == this) {
			if (direita != null) 
				nodo.direita = esquerda;
			else
				nodo.direita = direita;
		}
		return true;
	}

	public int MenorValorEsquerda() {
		if (esquerda == null)
			return valor;
		else
			return esquerda.MenorValorEsquerda();
	}
	
}
