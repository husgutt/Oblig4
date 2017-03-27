public class Legemiddel{

  public String navn;
  public int ID;
  public double pris;
  public double virkestoff;

  public Legemiddel(String navn, double pris, double virkestoff){
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
  }

  public int hentId() { return ID; }
  public String hentNavn() { return navn; }
  public double hentPris() { return pris;   }
  public double hentVirkestoff() { return virkestoff;  }

public String toString(){
  return navn;
}

}
