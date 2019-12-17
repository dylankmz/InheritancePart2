public class Eend extends Dier implements Vogel {

    public Eend (String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println(getNaam() + "Kwak");
    }

    @Override
    public void vlieg() {
        System.out.println(getNaam() + ": vliegt in de lucht!");

    }
}
