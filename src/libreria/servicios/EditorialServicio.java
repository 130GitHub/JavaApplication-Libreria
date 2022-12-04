/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistence.ControllerPersistence;

/**
 *
 * @author Leo
 */
public class EditorialServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void altaEditorial(){
        Editorial e=new Editorial();
        System.out.println("Ingrese el nombre de la Editorial");
        e.setNombre(leer.next());
        e.setAlta(Boolean.TRUE);
        ControllerPersistence cP=new ControllerPersistence();
        cP.crearEditorial(e);
    }

    List<Editorial> mostrarEditoriales() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ControllerPersistence cP=new ControllerPersistence();
        List<Editorial> listaEditoriales=cP.editorial();
        return listaEditoriales;
    }
}
