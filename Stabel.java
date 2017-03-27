import java.util.Iterator;

public class Stabel<T> implements Liste<T> {
	
	protected Node foran;
	protected Node siste;
	protected Node gjeldende = null;
	protected Node gjeldendeNeste = null;
	protected int N;
	
	
	
	public Stabel() {
		foran = null;
		siste = null;
		N = 0;
	}
	
	


	@Override
	public Iterator<T> iterator() {
		return new listeIterator();
	}
	
	protected class listeIterator implements Iterator<T> {
		private Node current = foran;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if(!hasNext()) throw new UnsupportedOperationException();
			T item = current.data;
			gjeldende = current;
			current = current.neste;
			gjeldendeNeste = current;
			return item;
		}
		
		
		public Node nextNode() {
			if(!hasNext()) throw new UnsupportedOperationException();
			Node n = current;
			current = current.neste;
			return n;
		}
		
	}

	@Override
	public int storrelse() {
		return N;
	}

	@Override
	public boolean erTom() {
		return N == 0;
	}

	
	public void settInn(T element) {
		if(!erTom()){
			Node nodeStart = foran;
			Node nyNode = new Node(element);
			foran = nyNode;
			nyNode.neste = nodeStart;
		}
		else{
			foran = new Node(element);
		}
		N++;
		
	}

	@Override
	public T fjern() {
		if(erTom()) {throw new IllegalStateException("Kan ikke fjerne fra en tom liste");}
		Node nesteNodeEtterForan = foran.neste;
		Node nesteNode = foran;
		foran = nesteNodeEtterForan;
		N--;
		return nesteNode.data;
		
	}

	protected class Node {
		protected T data;
		protected Node neste;
		protected Node forrige;
		
		public Node(T data) {
			this.data = data;
		}
	}

}
