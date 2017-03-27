public class LegemiddelB extends Legemiddel{

  private int vanedannendeStyrke;

  public LegemiddelB(String navn, double pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    vanedannendeStyrke = styrke;
  }

  public int hentVanedannendeStyrke() {
    return vanedannendeStyrke;
  }
}
