public class Application {
    public static void main(String[] args) {

        Dier d1 = new Kat("Ester: ");
        d1.maakGeluid();

        Dier d2 = new Hond("Lassie: ");
        d2.maakGeluid();

        Dier d3 = new Eend("Ducky: ");
        d3.maakGeluid();

        Dier d4 = new Slang("Sissy: ");
        ((Slang)(d4)).vervel();

        Kat k1 = new HuisKat("Ludo");
        k1.vangMuis();

        Kat k2 = new WildeKat("Cindy");
        k2.vangMuis();

    }
}
