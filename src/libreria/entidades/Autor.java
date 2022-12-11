/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Leo
 */
@Entity
public class Autor implements Serializable {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    @Basic String nombre;
    Boolean alta;
    String atributoDePrueba;

    public Autor() {
    }

    public Autor(/*Integer id,*/ String nombre, Boolean alta) {
        //this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Long getId() {
        return id;
    }
/*
    public void setId(Integer id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }
    
}
