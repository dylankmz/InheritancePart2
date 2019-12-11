public class Dier {

    String naam;

    public Dier(String naam) {
        this.naam = naam;
    }


    public void maakGeluid() {
        System.out.print(naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
