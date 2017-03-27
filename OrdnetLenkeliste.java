public class OrdnetLenkeliste<T extends Comparable<T>> extends Stabel<T> {

	public void settInn(T element) {

		if (!erTom()) {

			Node temp = new Node(element);
			Node current = foran;

			A: while (current.neste != null) {
				
				if (element.compareTo(foran.data) < 0 || element.compareTo(foran.data) == 0) {					
					temp.neste = foran;
					foran  = temp;
					break A;
				}				
				
				else if (element.compareTo(current.neste.data) < 0 || element.compareTo(current.neste.data) == 0) {
					temp.neste = current.neste;
					current.neste = temp;
					break A;
				} else {
					current = current.neste;
				}
			}
			
			if (current.neste == null) {
				if (element.compareTo(current.data) < 0 || element.compareTo(current.data) == 0) {
					temp.neste = current;
					foran = temp;
				}else{
					current.neste = temp;
				}
			}

		}

		else {
			foran = new Node(element);
		}
		N++;

	}
}