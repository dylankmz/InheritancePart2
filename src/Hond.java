public class Hond extends Dier {

    public Hond(String naam) {
        super(naam);

    }
    public class Dier {

        public void maakGeluid() {
            System.out.println(getNaam() + " : dieren geluid!!!!");
        }
    }

}

