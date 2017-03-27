public abstract class Resept{

protected int ID;
protected Legemiddel legemiddel;
protected Lege lege;
protected int pasientId;
protected int reit;

public int hentId() { return ID;}
public Legemiddel hentLegemiddel() { return legemiddel; }
public Lege hentLege() { return lege; }
public int hentPasientId() { return pasientId; }
public int hentReit() { return reit; }

/**
 * Bruker resepten én gang. Returner false om resepten er
 * oppbrukt, ellers returnerer den true.
 * @return      om resepten kunne brukes
 */
public boolean bruk() {
  boolean ret = false;

  if(reit > 0 ){
    ret = true;
    reit -= 1;
  }
  return ret;
}


abstract public String farge();

/**
 * Returnerer prisen pasienten maa betale.
 * @return      prisen pasienten maa betale
 */
abstract public double prisAaBetale();


public String toString(){
  return legemiddel.hentNavn() + "Lege: " + lege.hentNavn();
}

}
