/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistence.ControllerPersistence;

/**
 *
 * @author Leo
 */
public class AutorServicio {    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void altaAutor(){
        Autor a=new Autor();
        System.out.println("Ingrese el nombre del Autor");
        a.setNombre(leer.next());
        a.setAlta(Boolean.TRUE);
        ControllerPersistence cP=new ControllerPersistence();
        cP.crearAutor(a);
    }
    public void bajaAutor(){
        System.out.println("Ingrese el id del Autor que desea eliminar");
        Long id=leer.nextLong();
        ControllerPersistence cP=new ControllerPersistence();
        cP.bajaAutor(id);
    }

    public void editarAutor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
            System.out.println("Ingrese el id del Autor que desea editar");
            Long id=leer.nextLong();
            ControllerPersistence cP=new ControllerPersistence();
            cP.editarAutor(id);  
        }catch(Exception ex){
            throw ex;
        }
        
    }

    public void buscarAutorXnombre() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese el nombre del Autor a buscar");
        String nombre=leer.next();
        ControllerPersistence cP=new ControllerPersistence();
        cP.buscarAutorXnombre(nombre);
    }
    
    public List<Autor> mostrarAutores() {
        ControllerPersistence cP=new ControllerPersistence();
        List<Autor> listaAutores=cP.autor();
        return listaAutores;
    }
}
