/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistence.ControllerPersistence;

/**
 *
 * @author Leo
 */
public class LibroServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void altaLibro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Libro l=new Libro();
        System.out.println("Ingrese el isbn del Libro");
        l.setIsbn(leer.nextLong());
        System.out.println("Ingrese el titulo del Libro");
        l.setTitulo(leer.next());
        System.out.println("Ingrese el año del Libro");
        l.setAnio(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares del Libro");
        l.setEjemplares(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados del Libro");
        l.setEjemplaresPrestados(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares restantes del Libro");
        l.setEjemplaresRestantes(leer.nextInt());
        //AUTOR
        AutorServicio aS=new AutorServicio();
        List<Autor> lA=aS.mostrarAutores();
        System.out.println("Ingrese el Autor");
        for(int indice = 0; indice<lA.size(); indice++)
        {
            System.out.println(indice+"-"+lA.get(0)+"  "+lA.get(1));
        }
        int i=leer.nextInt();
        l.setAutor(lA.get(i));
        //EDITORIAL
        EditorialServicio eS=new EditorialServicio();
        List<Editorial> lE= eS.mostrarEditoriales();
        System.out.println("Ingrese la Editorial");
        for(int indice = 0; indice<lE.size(); indice++){
            System.out.println(indice+"-"+lE.get(0));
        }
        int j=leer.nextInt();
        l.setEditorial(lE.get(j));
        
        l.setAlta(Boolean.TRUE);
        ControllerPersistence cP=new ControllerPersistence();
        cP.crearLibro(l);
    }
}
