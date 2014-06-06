/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package versionamiento;

/**
 *
 * @author DELL
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;


public class Versionamiento {

    /**
     * @param args the command line arguments
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int op;
         System.out.println("--- VERSIONAMIENTO ---");
         System.out.println("\n 1. Crear y escribir archivo txt\n"
                 + "2. Leer archivo txt");
         System.out.print("Elija una opción:");
         op = sc.nextInt();
         switch (op){
             case 1:
                 //Un texto cualquiera guardado en una variable
                 String saludo="Hola";
                 try
                 {
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                 File archivo=new File("texto.txt");

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                 FileWriter escribir=new FileWriter(archivo,true);

//Escribimos en el archivo con el metodo write 
                 escribir.write(saludo);

//Cerramos la conexion
                 escribir.close();
}

//Si existe un problema al escribir cae aqui
                catch(IOException e){
                    System.out.println("Error al escribir");
}
                break;
             case 2:
                 String texto="";
                 try
                 {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
                   FileReader lector=new FileReader("texto.txt");

//El contenido de lector se guarda en un BufferedReader
                   BufferedReader contenido=new BufferedReader(lector);

//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                   while((texto=contenido.readLine())!=null)
                   {
                       System.out.println(texto);
                   }
                 }

//Si se causa un error al leer cae aqui
                 catch(IOException e)
                 {
                     System.out.println("Error al leer");
                 }
         }
    }
                 
}
       


    

