package Sesion21.Inicial;

public class Main {
    public static void main(String []args) {

        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "Dariojpenna";
        usuario.nombre = "Dario";
        usuario.apellidos = "Penna";
        usuario.email = "dariojpenna@gmail.com";
        usuario.nivelAcceso = 10;
        usuario.telefono = "3584315475";

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "Agosvinyal";
        usuario2.nombre = "AGos";
        usuario2.apellidos = "Vinyals";
        usuario2.email = "agostinavinyals@gmail.com";
        usuario2.nivelAcceso = 8;
        usuario2.telefono = "3584306754";

        Usuarios usuarios = new Usuarios();


        usuarios.crearUsuario(usuario);
        usuarios.crearUsuario(usuario2);

        usuarios.obtenerListado();


        System.out.println("\n");
        usuarios.borrarUsuario("Dariojpenna");
        usuarios.obtenerListado();

//        Sesion21.Final.Usuario usuario = new Sesion21.Final.Usuario();
//        usuario.nombreUsuario = "openbootcamp";
//        usuario.nombre = "Open";
//        usuario.apellidos = "Bootcamp";
//        usuario.email = "ejemplos@open-bootcamp.com";
//        usuario.nivelAcceso = 10;
//
//        Sesion21.Final.Usuarios usuarios = new Usuarios();
//        usuarios.crearUsuario(usuario);
//
//        Sesion21.Final.Usuario usuario2 = new Sesion21.Final.Usuario();
//        usuario2.nombreUsuario = "openbootcamp2";
//        usuario2.nombre = "Open";
//        usuario2.apellidos = "Bootcamp";
//        usuario2.email = "ejemplos@open-bootcamp.com";
//        usuario2.nivelAcceso = 10;
//        usuarios.crearUsuario(usuario2);
//
//        Sesion21.Final.Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
//        System.out.println(openbootcamp.email);
//
//        System.out.println(usuarios);

//        usuarios.borrarUsuario("openbootcamp2");
//        for (Usuario a : usuarios.listarUsuarios()) {
//            System.out.println(a.nombreUsuario);
//        }
    }
}
