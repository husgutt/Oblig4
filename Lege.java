public class Lege implements Comparable<Lege> {

String navn;
Koe<Resept> resepter;

public Lege(String navn){
  this.navn = navn;
  resepter = new Koe<Resept>();

}

public String hentNavn() { return navn; }

public int compareTo(Lege annenLege) {
  return navn.compareTo(annenLege.hentNavn());
 }
public void leggTilResept(Resept resept) {
  resepter.settInn(resept);
}
public Koe<Resept> hentReseptliste() {
    return resepter;
}

public String toString(){
  return navn;
}

}
