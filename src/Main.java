public class Main {

    public static void main(String[] args) {
        TimeWar war = new TimeWar();
        war.empezarGuerra();

        Personaje  p = new Heroe(Raza.TIMELORD,"The Doctor");
        System.out.println("Soy "+p.getNombre());
        p.presentarse();
        p.atacar();

        System.out.println("----");

        Personaje  b = new Monstruo(Raza.DALEK,"Davros");
        System.out.println("Soy "+b.getNombre());
        b.presentarse();
        b.atacar();
        System.out.println("----");
        System.out.println("*DESPUES DE UN RATO*");
        System.out.println("----");
        war.congelarGuerra();
    }
}
