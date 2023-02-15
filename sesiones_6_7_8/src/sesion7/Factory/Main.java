package sesion7.Factory;

public class Main {
    public static void main (String []args) {
        Factory factory = new Factory("España");
        System.out.println("El precio para España es: " + factory.getPrecio());

        Factory factory2 = new Factory("USA");
        System.out.println("El precio para  USA es: " + factory2.getPrecio());

        Factory factory3 = new Factory("Argentina");
        System.out.println("El precio para Argentina es: " + factory3.getPrecio());

    }
}
