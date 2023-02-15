package sesion8.Decorator;

public class TelefonoBasicoBasico implements Telefono{

    @Override
    public void crear (){
        System.out.println( "Soy el telefono mas basico de todos, caracteristicas: ");
        basicobasico();

    }
    public void basicobasico() {
        System.out.println("   ->Tengo solo Mjes");
    }
}

