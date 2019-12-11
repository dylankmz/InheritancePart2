public class Main {

    public static void main(String[] args) {

        Dier d1 = new Dier ("Frans");
        Hond d2 = new Hond ("Bob");
        Kat d3 = new Kat("Louise");
        Slang d4 = new Slang("Snake");

        d1.maakGeluid();
        d2.maakGeluid();
        d3.maakGeluid();
        d4.vervel();

    }

}
