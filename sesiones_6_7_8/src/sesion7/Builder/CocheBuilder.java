package sesion7.Builder;

public class CocheBuilder {
    Vehiculo vehiculo;// variable tipo Vehiculo

    private CocheBuilder() {};// no se puede instanciar

    public CocheBuilder (String marca) {
        vehiculo = new Vehiculo(marca);
        vehiculo.marca = marca;
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this; // se devuelve a si mismo para poder usar el metodo funcional y hacer .x.y.t
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    public CocheBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;
    }

    public Vehiculo build() {
        return this.vehiculo;
    }
}