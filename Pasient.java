public class Pasient{

String navn;
long fodselsnummer;
String gateadresse;
int postnummer;
Stabel<Resept> reseptListe;
int id;


Pasient(String navn, long fodselsnummer, String gateadresse, int postnummer) {
          this.navn = navn;
          this.fodselsnummer = fodselsnummer;
          this.gateadresse = gateadresse;
          this.postnummer = postnummer;

          reseptListe = new Stabel<Resept>();

}

public int hentId() {
  return id;
 }
public String hentNavn() {
  return navn;
}
public long hentFodselsnummer() {
  return fodselsnummer;
}
public String hentGateadresse() {
  return gateadresse;
}
public int hentPostnummer() {
  return postnummer;
}
public void leggTilResept(Resept resept) {

}
public Stabel<Resept> hentReseptliste() {
  return reseptListe;
}

public String toString(){
  return navn + " " + "(" + fodselsnummer + ")";
}

}
