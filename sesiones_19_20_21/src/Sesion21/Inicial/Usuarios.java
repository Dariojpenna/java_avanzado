package Sesion21.Inicial;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
  //  public String ficheroDatos = "usuarios.txt";

    public ArrayList<Usuario> pasasarUsuariosFicheroArray() {
        ArrayList<Usuario> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File("usuarios2.txt"));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String[] partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);
                usuario.telefono = partes[5];

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return usuarios;
    }

//    public ArrayList<Usuario> listarUsuarios() {
//        ArrayList<Usuario> usuarios = new ArrayList();
//
//        try {
//            Scanner scanner = new Scanner(new File(ficheroDatos));
//
//            while (scanner.hasNext()) {
//                String usuarioActual = scanner.next();
//                String []partes = usuarioActual.split(",");
//
//                Usuario usuario = new Usuario();
//                usuario.nombreUsuario = partes[0];
//                usuario.nombre = partes[1];
//                usuario.apellidos = partes[2];
//                usuario.email = partes[3];
//                usuario.nivelAcceso = Integer.parseInt(partes[4]);
//
//                usuarios.add(usuario);
//            }
//
//            scanner.close();
//        } catch (Exception e) {
//        }
//
//        return usuarios;
//    }

    public Usuario obtenerUsuario(String username) {

        ArrayList<Usuario> usuarios = pasasarUsuariosFicheroArray();

        for(Usuario usuario : usuarios)
            if (usuario.nombreUsuario.equalsIgnoreCase(username))
                return usuario;

        return null;
    }

    public void crearUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = pasasarUsuariosFicheroArray();

        if (obtenerUsuario(usuario.nombreUsuario)!=null)
            System.out.println("El usuario ya exisite");
        else {
            try {
                PrintStream printStream = new PrintStream("usuarios2.txt");

                for (Usuario usuarioExistente : usuarios) {
                    printStream.println(separarUsuarioPorComas(usuarioExistente));
                }
                printStream.println(separarUsuarioPorComas(usuario));

            } catch (Exception e) {
                System.out.println("-WTF");
            }

        }

    }

    public String separarUsuarioPorComas (Usuario usuario){
        return   usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso + ","
                + usuario.telefono;
    }
    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios = pasasarUsuariosFicheroArray();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(username)) {
                usuarios.remove(i);
            }
        }

        try{
            PrintStream printStream = new PrintStream("usuarios2.txt");

            for (Usuario usuario: usuarios){

                String buffer = separarUsuarioPorComas(usuario);
                printStream.println (buffer);
            }


        }catch (IOException e){

        }


    }

    public void obtenerListado (){

        for (Usuario usuario : pasasarUsuariosFicheroArray()){
            System.out.println( usuario.nombreUsuario);
        }
    }

}
