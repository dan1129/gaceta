/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Usuario_Borrador implements Serializable{
    
    @Id 
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idusuario", nullable = false)
    public int idUsuario;
    
    @Id 
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idborrador", nullable = false)
    public int idBorrador;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdBorrador() {
        return idBorrador;
    }

    public void setIdBorrador(int idBorrador) {
        this.idBorrador = idBorrador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idUsuario;
        hash = 97 * hash + this.idBorrador;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario_Borrador other = (Usuario_Borrador) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idBorrador != other.idBorrador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario_Borrador{" + "idUsuario=" + idUsuario + ", idBorrador=" + idBorrador + '}';
    }
    
    
}