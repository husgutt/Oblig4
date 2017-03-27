public class Koe<T> extends Stabel<T> {

	public Koe() {
		super();
	}

	public void settInn(T element) {
		if(!erTom()){
			Node nodeSlutt = siste;
			Node nyNode = new Node(element);
			siste = nyNode;
			nodeSlutt.neste = siste;
		}
		else{
			siste = new Node(element);
			foran = siste;
		}
		N++;
	}



}
