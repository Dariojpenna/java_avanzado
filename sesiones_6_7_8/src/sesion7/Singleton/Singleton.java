package sesion7.Singleton;

public class Singleton {
    private static Singleton instancia;
    boolean check = false;
    public int contador = 0;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void check(){
        if(check == false){
            System.out.println("Arrancando");
            check = true;

        }else{
            System.out.println("La instacia ya fue creada");
        }
    }
}
