package sesion7.Singleton;

public class Main  {

    public static void main(String []args) {
        Singleton misingleton = Singleton.getInstance();
        misingleton.setContador(15);

        Singleton miSingleton2 = Singleton.getInstance();
        misingleton.check();//checkeamos que la app se ejecuta 2 veces
        miSingleton2.check();
        miSingleton2.setContador(2);// no crea una instancia nueva si no que la modifica
        System.out.println("El contador es: " + miSingleton2.getContador());
        System.out.println(misingleton);// checkeamos que esten en la misma sona de memoria
        System.out.println(miSingleton2);
    }
}
