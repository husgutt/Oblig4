public class BlaaResept extends Resept{

public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
  this.legemiddel = legemiddel;
  lege = utskrivendeLege;
  this.pasientId = pasientId;
  this.reit = reit;
}

public String farge(){
  return "Blå";
};


public double prisAaBetale(){
  return legemiddel.hentPris() * 0.25;
}

}
