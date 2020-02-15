public class Heroe extends Personaje implements Tardis{

    public int nivelBondad;

    public Heroe(Raza raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Debemos salvar a Gallifrey y detener la guerra del tiempo de una vez por todas!");
    }

    @Override
    public void atacar() {
        switch (raza){
            case DALEK:
                System.out.println("Jamas he exterminado a otro dalek, ni he estado a favor de los Timelords pero EXTERMINATE!");
                break;
            case HUMANO:
                System.out.println("Te ataco con mi arma");
                break;
            case TIMELORD:
                System.out.println("Por gallifrey!");
                break;
            case WEEPING_ANGEL:
                System.out.println("Shh parpadeaste");
                break;
        }
    }

    public void posar(){}

    public int getNivelBondad() {
        return nivelBondad;
    }

    public void setNivelBondad(int nivelBondad) {
        this.nivelBondad = nivelBondad;
    }

    @Override
    public void viajarEnElTiempo() {

    }

    @Override
    public void viajarEnElEspacio() {

    }
}
