package arvore_binaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<String> lista = new ArrayList<>();

	public static void main(String[] args) {
		
		ArvoreBinaria ab = new ArvoreBinaria();
		
		ab.insere(5);
		ab.insere(3);
		ab.insere(4);
		ab.insere(7);
		ab.insere(6);
		ab.insere(17);
		ab.insere(12);
		ab.insere(25);
		
		//Leitura
		System.out.println("_____Em Ordem____________");
		ab.percorre(new EmOrdem());
		System.out.println("_____Profundidade________");
		ab.percorre(new Profundidade());
		System.out.println("_____Em Nivel____________");
		ab.percorre(new EmNivel());
		System.out.println(" ");
		
		//Remocao
		System.out.println("_____Excluindo___________");
		ab.deletar(7);

		System.out.println(" ");
		System.out.println("_____Profundidade_________");
		ab.percorre(new Profundidade());
	}

}
