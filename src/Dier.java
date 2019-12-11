public class Dier {

    String naam;

    public void maakGeluid() {
        System.out.println("naam: dieren geluid");
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Dier(String naam) {
        this.naam = naam;
    }
}
