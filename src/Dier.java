public abstract class Dier {

    private String naam;

    public Dier(String naam) {
        this.naam = naam;
    }

    public abstract void maakGeluid();

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
