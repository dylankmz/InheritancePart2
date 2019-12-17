public class Slang extends Dier implements Jager {

    public Slang(String naam) {
        super (naam);
    }

    @Override
    public void maakGeluid() {

    }
    public void vervel() {
        System.out.println(getNaam() + "ik vervel");

    }

    @Override
    public void jaag() {
        System.out.println(getNaam() + ": vogeltje gevangen!");
    }
}
