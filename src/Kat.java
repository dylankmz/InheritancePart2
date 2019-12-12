public class Kat extends Dier {

    @Override
    public void maakGeluid() {
        System.out.println(getNaam() + "Miaw");
    }
    public Kat(String naam) {
        super(naam);
    }

    public final void vangMuis() {
        System.out.println(getNaam() + ": muis gevangen!");
    }

}
