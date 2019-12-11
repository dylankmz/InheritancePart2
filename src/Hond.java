public class Hond extends Dier {

    public Hond(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        super.maakGeluid();
        System.out.println("Waf");
    }
}
