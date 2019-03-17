package arvore_binaria;

import java.util.ArrayList;
import java.util.List;

public class ArvoreBinaria {
	
	private Nodo raiz;
	boolean result;
	Nodo aux;
	
	static List<String> lista = new ArrayList<>();
	
	public boolean insere(int value) {
		if(raiz == null) {
			System.out.println(value+" eh a raiz da arvore.");
			raiz = new Nodo(value);
			return true;
		} else
			return raiz.insere(value);
	}
		
	//Chama a classe delete passando raiz, raiz e numero a ser deletad
	public boolean deletar(int valor) {
		if (raiz == null) {
			return false;
		} else {
			if (raiz.getValor() == valor) {
				
				aux = new Nodo(valor);
				aux.setEsquerda(raiz);
				result = raiz.deletar(valor, aux);
				raiz = aux.getEsquerda();
				return result;
				
			} else {
				return raiz.deletar(valor, null);
			}
		}
	}
	
	void percorre(IPercorre metodo) {
		metodo.percorre(raiz);
	}
}
