/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationlibreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Leo
 */
public class JavaApplicationLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        String opcion;
        do{
            System.out.println("*********MENU***********");                
            System.out.println("1 - Agregar Autor");
            System.out.println("2 - Eliminar Autor");
            System.out.println("3 - Editar Autor");
            System.out.println("4 - Buscar Autor por Nombre");
            System.out.println("5 - Agregar Libro");
            System.out.println("6 - Agregar Editoria");
            System.out.println("0 - Salir");
            
            opcion = leer.next();
            AutorServicio aS=new AutorServicio();
            LibroServicio lS=new LibroServicio();
            EditorialServicio eS=new EditorialServicio();
            switch(opcion){
                case "1":
                    aS.altaAutor();
                    break;
                case "2":
                    aS.bajaAutor();
                    break;
                case "3":
                    aS.editarAutor();
                    break;
                case "4":
                    aS.buscarAutorXnombre();
                    break;
                case "5":
                    lS.altaLibro();
                    break;
                case "6":
                    eS.altaEditorial();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        }while(!opcion.equals("0"));
        
        
    }
}
