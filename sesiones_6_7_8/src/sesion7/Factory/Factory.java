package sesion7.Factory;

public class Factory {
    private Precio precio;

    private Factory() {}; // hacemos el constrctor privado para que no se puedar usar desde afuera
    public Factory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            this.precio = new PrecioEUR();
        } else if(pais.equalsIgnoreCase("Argentina")) {
            this.precio = new PrecioARG();
        }
        else {
            this.precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}

