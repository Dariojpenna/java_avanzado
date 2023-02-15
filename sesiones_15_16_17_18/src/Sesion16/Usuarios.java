package Sesion16;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> usuarios = new ArrayList();

    public void meterUsuario ( String nombre) throws UsuarioYaRegistrado, UsuarioNombreCorto {
        if (nombre.length()<4){
            throw new UsuarioNombreCorto("El nombre " + nombre +" es demasiado corto");
        }
        if (usuarios.contains(nombre)){
            throw new UsuarioYaRegistrado("Error, el usuario "+ nombre + " ya existe");
        }
        usuarios.add(nombre);
        System.out.println("Se agrego a " + nombre + " a la lista");

    }
}
