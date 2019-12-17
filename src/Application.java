import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Dier d1 = new Kat("Ester: ");
        d1.maakGeluid();

        Dier d2 = new Hond("Lassie: ");
        d2.maakGeluid();

        Dier d3 = new Eend("Ducky: ");
        d3.maakGeluid();

        Dier d4 = new Slang("Sissy: ");
        ((Slang) (d4)).vervel();

        Kat k1 = new HuisKat("Ludo");
        k1.vangMuis();

        Kat k2 = new WildeKat("Cindy");
        k2.vangMuis();

        Slang s1 = new Slang("Slossy");
        s1.jaag();

        Eend e1 = new Eend("Kwakki");
        e1.vlieg();


        ArrayList<Dier> zoo = new ArrayList<>();

        zoo.add(k1);
        zoo.add(k2);
        zoo.add(s1);
        zoo.add(e1);
        zoo.add(d1);
        zoo.add(d2);
        zoo.add(d3);


        for (Dier dier : zoo) {

            dier.maakGeluid();

            if (dier instanceof Slang) {
                ((Slang) dier).vervel();
            }
            if (dier instanceof Jager) {
                ((Jager) dier).jaag();

            }
            if (dier instanceof Vogel) {
                ((Vogel) dier).vlieg();
            }
        }


    }
}
