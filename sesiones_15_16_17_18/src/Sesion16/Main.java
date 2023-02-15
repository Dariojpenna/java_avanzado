package Sesion16;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int valor = 3;
        int dividendo =0;

        Usuarios usuarios = new Usuarios();

        try {
            usuarios.meterUsuario ("Dario");
            usuarios.meterUsuario ("Agos");
            usuarios.meterUsuario ("Dario");

        }catch (UsuariosException e){
            System.out.println(e.getMessage());
        }



//
//        try {
//            divisionPorCero(valor, dividendo);
//        }catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");//CAPTURO LAS EXCEPCIONES POR SEPARADO
//        }catch (IOException e) {
//            System.out.println("IOException");
//        }


//        }catch(Exception e){
//            System.out.println( e.getClass()); CAPTURO TODAS LAS EXCEPCIONES
//
//        }



    }

    public static int divisionPorCero(int valor, int dividendo) throws IOException,ArithmeticException {
        try{
            return valor/dividendo;



        }catch (ArithmeticException e){
            if (valor==1 ) {
                throw new ArithmeticException();
            }
            throw new IOException();
        }

    }
}
