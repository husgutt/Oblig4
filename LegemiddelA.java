public class LegemiddelA extends Legemiddel{

  private int narkotiskStyrke;

  public LegemiddelA(String navn, double pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    narkotiskStyrke = styrke;
  }

  public int hentNarkotiskStyrke () {
    return narkotiskStyrke;
  }

}
