/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
/**
 *
 * @author Smart
 */
public class ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
     
        boolean bandera = true;
        int opcion;
        String salida;
        String sa;
        int contador = 0;
        String facebook = "";
        String whatsapp = "";
        String signal = "";
        String flickr = "";
        while (bandera == true) {
            System.out.println("Ingrese 1 para crear una cuenta de Facebook\n"+
                    "Ingrese 2 para crear una cuenta en Twitter\n"+
                    "Ingrese 3 para crear una cuenta en Whatsapp\n"+
                    "Ingrese 4 para crear una cuenta en Telegram\n"+
                    "Ingrese 5 para crear una cuenta en Signal\n"+
                    "Ingrese 6 para crear una cuenta en Instagram\n"+
                    "Ingrese 7 para crear una cuenta en Flickr\n");
            opcion = entrada.nextInt();
            if(opcion == 1){
                facebook = crearFacebook();
            }else{
                if(opcion == 2){
                    crearTwitter();
                }else{
                    if(opcion == 3){
                        whatsapp = crearWhatsapp();
                    }else{
                        if(opcion == 4){
                            crearTelegram();
                        }else{
                            if(opcion == 5){
                                signal = crearSignal();
                            }else{
                                if(opcion == 6){
                                    crearInstagram();
                                }else{
                                    if(opcion == 7){
                                        flickr = crearFlickr();
                                    }else{
                                        System.out.println("Opcion incorrecta");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((opcion >= 1) && (opcion <= 7)){
                contador = contador + 1;
            }
            entrada.nextLine();
            System.out.println("Ponga si para dejar de crear cuentas");
            sa = entrada.nextLine();
            salida = sa.toLowerCase();
            if(salida.equals("si")){
                bandera = false;
            }
        }
        System.out.printf(facebook + whatsapp + signal + flickr);
        obtenerMensaje(contador);
        String cadena = obtenerMensaje(contador);
        System.out.println(cadena);  
     }
        public static String crearFacebook(){
            
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String cadena = "";
        System.out.println("usted escogio la opcion crear facebook");
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        cadena = String.format("%sFacebook\nUsuario: %s\nEdad: %d\n"
                + "Ciudad: %s\nPais: %s\nCorreo: %s\n", cadena, usuario,
                edad, ciudad, pais, correo);
        return cadena;
    }
         public static void crearTwitter(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingtese su idioma");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        System.out.printf("Twitter\nUsuario: %s\nNombres: %s\nApellidos: %s\n"
                + "Edad: %d\nCiudad: %s\nPais: %s\nIdioma: %s\nCorreo: %s\n",
                usuario, nombre, apellido, edad, ciudad, pais, idioma,
                correo);
    }
    public static String crearWhatsapp(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        int edad;
        String ciudad;
        String pais;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        cadena = String.format("%sWhatsapp\nUsuario: %s\nNumero: de telefono:"
                + " %d\nEdad: %d\nCiudad: %s\nPais: %s\n", cadena, usuario,
                numero, edad, ciudad, pais);
        return cadena;
    }
    public static void crearTelegram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String area;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el area de interés");
        area = entrada.nextLine();
        System.out.printf("Telegram\nUsudario: %s\nNumero de telefono: %d\n"
                + "Ciudad: %s\nPais: %s\nArea de interés: %s\n", usuario,
                numero, ciudad, pais, area);
    }
    public static String crearSignal(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String hobby;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal");
        hobby = entrada.nextLine();
        cadena = String.format("%sSignal\nUsuario: %s\nNumero de telefono:"
                + " %d\nCiudad: %s\nPais: %s\nHobby principal: %s\n", cadena,
                usuario, numero, ciudad, pais, hobby);
        return cadena;
    }
    public static void crearInstagram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String ciudad;
        int edad;
        String correo;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        System.out.printf("Instagram\nUsuario: %s\nCiudad: %s\nEdad: %d\n"
                + "Correo: %s\n", usuario, ciudad, edad, correo);
    }
    public static String crearFlickr(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correo;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        cadena = String.format("%sFlickr\nUsuario: %s\nCorreo: %s", cadena,
                usuario, correo);
        return cadena;
    }
    public static String obtenerMensaje(int numeroCuentas){
       
        String [] mensajeFinal = {"\nCampaña con poca afluencia", 
            "\nCampaña moderada siga adelante", "\nExcelente campaña"};
        String cadena = "";
        if ((numeroCuentas >= 1) && (numeroCuentas <= 5)){
                cadena = mensajeFinal[0];
            }else{
            if ((numeroCuentas >= 6) && (numeroCuentas <= 15)){
                cadena = mensajeFinal[1];
            }else{
                if (numeroCuentas >= 16){
                    cadena = mensajeFinal[2];
                }
            }
        }
        return cadena;
    }
}

 
