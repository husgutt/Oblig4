import java.util.Iterator;

public class StatiskTabell<T> implements Tabell<T> {

	private int kapasitet;
	private int antEl;
	T[] tabell;

	@SuppressWarnings("unchecked")
	public StatiskTabell(int kapasitet) {
		this.kapasitet = kapasitet;
		tabell = (T[]) new Object[kapasitet];
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int i = 0;

			@Override
			public boolean hasNext() {
				if(i < kapasitet && i < antEl){
					return true;
				}
				return false;
			}

			@Override
			public T next() {
				if(!hasNext()){
					throw new UgyldigPlassUnntak(i, kapasitet);
				}
				else {
					i++;
					return tabell[i - 1];
				}
				
			}
		};
	}

	@Override
	public int storrelse() {
		int s = 0;
		Iterator<T> it = this.iterator();
		for(int i = 0; i < kapasitet; i++){
			if(tabell[i] != null) s++;
		}
		return s;
	}

	@Override
	public boolean erTom() {
		boolean erTom = true;
		Iterator<T> it = this.iterator();
		while(it.hasNext()){
			if(it.next() != null) erTom = false;
		}
		return erTom;
	}

	@Override
	public void settInn(T element) {
		if(this.storrelse() == kapasitet) throw new FullTabellUnntak(kapasitet);
		tabell[antEl] = element;
		antEl ++;

	}

	@Override
	public T hentFraPlass(int plass) {
		if(plass >= kapasitet || plass < 0){
			throw new UgyldigPlassUnntak(plass, kapasitet);
		}
		return tabell[plass];
		
	}

}
