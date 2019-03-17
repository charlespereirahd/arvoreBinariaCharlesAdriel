package arvore_binaria;

public class Profundidade implements IPercorre{
	
	@Override
	public void percorre(Nodo nodo) {
		if (nodo != null) {
			System.out.println("Valor "+nodo.getValor());
			percorre(nodo.getEsquerda());
			percorre(nodo.getDireita());
		}
	}

}