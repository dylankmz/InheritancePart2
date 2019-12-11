public class Dier {

    private String naam;

    public Dier(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void maakGeluid() {
        System.out.println(this.naam + " : dieren geluid!!!!");
    }
}
