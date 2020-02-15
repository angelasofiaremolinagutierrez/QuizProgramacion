public class TimeWar<T> implements Congelable {
    T beligerante;
    public void agregarBeligerante(T beligerante){

        this.beligerante = beligerante;
    }

    public T mostrarBeligerante(){

        return beligerante;
    }
    public void empezarGuerra(){
        System.out.println("La guerra del tiempo ha comenzado");
    }

    @Override
    public void congelarGuerra() {
        System.out.println("En este momento la guerra se ha convertido en un cuadro y todos sus participantes quedarán congelados en el tiempo y espacio");
    }
}
