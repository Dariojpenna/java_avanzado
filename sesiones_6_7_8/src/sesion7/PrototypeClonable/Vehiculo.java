package sesion7.PrototypeClonable;

public class Vehiculo implements Cloneable {
    public String marca;
    public String modelo;
    int anyoFabricacion;

    public Vehiculo() {}

    public Vehiculo clonar() throws CloneNotSupportedException {
        return (Vehiculo) this.clone(); // con el (Vehiculo) lo fuerzo a devolver un objeto tipo Vehiculo
    }
}
