public class HvitResept extends Resept{

public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
  this.legemiddel = legemiddel;
  lege = utskrivendeLege;
  this.pasientId = pasientId;
  this.reit = reit;
}

public String farge(){
  return "Hvit";
};

/**
 * Returnerer prisen pasienten maa betale.
 * @return      prisen pasienten maa betale
 */
public double prisAaBetale(){
  return legemiddel.hentPris();
}

}
