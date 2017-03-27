class Legeliste extends OrdnetLenkeliste<Lege> {
    /**
     * Soeker gjennom listen etter en lege med samme navn som `navn`
     * og returnerer legen (uten aa fjerne den fra listen).
     * Hvis ingen slik lege finnes, returneres `null`.
     * @param   navn    navnet til legen
     * @return  legen
     */
    public Lege finnLege(String navn) {

      Lege tempLege = null;
      if (!erTom()) {

        Node current = foran;
        A: while (current != null) {

          if (current.data.hentNavn().equals(navn)) {
            tempLege = current.data;
            break A;
          }

          current = current.neste;

        }

      }
      return tempLege;
    }

    /**
     * Returnerer et String[] med navnene til alle legene i listen
     * i samme rekkefoelge som de staar i listen.
     * @return array med navn til alle legene
     */
    public String[] stringArrayMedNavn() {
      String[] legeListeiString = new String[N];
      int i = 0;
      if (!erTom()) {

        Node current = foran;
        while (current != null) {
          legeListeiString[i] = current.data.hentNavn();
          current = current.neste;
        }

      }
      return legeListeiString;
    }
}
