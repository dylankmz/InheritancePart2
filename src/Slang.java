public class Slang extends Dier {

    public Slang(String naam) {
        super (naam);
    }

    @Override
    public void verVel() {
        super.verVel();
        System.out.println("vervel");
    }
}
