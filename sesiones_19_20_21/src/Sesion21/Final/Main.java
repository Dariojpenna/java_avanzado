package Sesion21.Final;

public class Main {
    public static void main(String []args) {
        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp";
        usuario3.nombre = "Open";
        usuario3.apellidos = "Bootcamp";
        usuario3.email = "ejemplos@open-bootcamp.com";
        usuario3.nivelAcceso = 10;

        Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario3);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crearUsuario(usuario2);

        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.email);

//        usuarios.borrarUsuario("openbootcamp2");
//        for (Usuario a : usuarios.listarUsuarios()) {
//            System.out.println(a.nombreUsuario);
//        }
    }
}
