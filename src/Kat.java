public class Kat extends Dier {

    @Override
    public void maakGeluid() {
        super.maakGeluid();
        System.out.println("Miaw");
    }
    public Kat(String naam) {
        super(naam);
    }
}
