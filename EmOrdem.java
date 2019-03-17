package arvore_binaria;

public class EmOrdem implements IPercorre{
	
	@Override
	public void percorre(Nodo nodo) {
		if (nodo != null) {
			percorre(nodo.getEsquerda());
			System.out.println("Valor "+nodo.getValor());
			percorre(nodo.getDireita());
		}
	}

}
