public abstract class Personaje {
    Raza raza;
    String nombre;

    public Personaje(Raza raza,String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }
    public abstract void presentarse();
    public abstract void atacar();

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
