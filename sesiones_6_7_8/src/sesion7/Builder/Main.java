package sesion7.Builder;

public class Main {
    public static void main(String []args) {
        Vehiculo coche = new CocheBuilder("Filostro")
                .setTipo("Diesel")
                .setMotor("Combustion")
                .setPuertas(5)
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Tipo: " + coche.getTipo());
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Puertas: " + coche.getPuertas());

        Vehiculo coche2 = new CocheBuilder("Chevrolet")
                .setTipo("Nafta")
                .setMotor("Combustion")
                .setPuertas(6)
                .build();

        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Tipo: " + coche2.getTipo());
        System.out.println("Motor: " + coche2.getMotor());
        System.out.println("Puertas: " + coche2.getPuertas());

    }
}
