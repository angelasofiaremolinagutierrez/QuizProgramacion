public class Monstruo extends Personaje{

    public int nivelMaldad;

    public Monstruo(Raza raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Hay que acabar a Gallifrey! Debemos ganar la guerra del tiempo.");
    }

    @Override
    public void atacar() {
        switch (raza){
            case DALEK:
                System.out.println("EXTERMINATE!");
                break;
            case HUMANO:
                System.out.println("Te ataco con mi arma");
                break;
            case TIMELORD:
                System.out.println("Estoy contra mi propio pueblo en esta batalla, no se como atacar!");
                break;
            case WEEPING_ANGEL:
                System.out.println("Shh parpadeaste");
                break;
        }
    }

    public void intimidar(){}

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    public void setNivelMaldad(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }
}

