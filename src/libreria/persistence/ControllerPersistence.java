/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Leo
 */
public class ControllerPersistence {
    AutorJpaController aJPA = new AutorJpaController();
    EditorialJpaController eJPA = new EditorialJpaController();
    LibroJpaController lJPA = new LibroJpaController();
    
    public void crearAutor(Autor a){
        try {
            aJPA.create(a);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bajaAutor(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            Autor a=aJPA.findAutor(id);
            a.setAlta(Boolean.FALSE);
            aJPA.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void editarAutor(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Autor a=aJPA.findAutor(id);
        
        System.out.println("Editando: "+a.getNombre());
        a.setNombre(leer.next()); 
        System.out.println("Editando: "+a.getAlta());
        a.setAlta(leer.nextBoolean());
        try {
            aJPA.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscarAutorXnombre(String nombre) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Autor> a=aJPA.findAutorXnombre(nombre);
        
        for(Autor autor:a){
            System.out.println(autor.getNombre());
            System.out.println(autor.getAlta());
            System.out.println(autor.getId());
        }
    }

    public void crearLibro(Libro l) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            lJPA.create(l);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Autor> autor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Autor> a=aJPA.findAutorEntities();
        return a;
    }

    public void crearEditorial(Editorial e) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            eJPA.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Editorial> editorial() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Editorial> e=eJPA.findEditorialEntities();
        return e;
    }
}
