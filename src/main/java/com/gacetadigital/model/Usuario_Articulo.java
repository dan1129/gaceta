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

public class Usuario_Articulo implements Serializable{
    
    @Id 
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idusuario", nullable = false)
    public int idUsuario;
    
    @Id 
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idarticulo", nullable = false)
    public int idArticulo;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idUsuario;
        hash = 37 * hash + this.idArticulo;
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
        final Usuario_Articulo other = (Usuario_Articulo) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idArticulo != other.idArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario_Articulo{" + "idUsuario=" + idUsuario + ", idArticulo=" + idArticulo + '}';
    }
    
    
}

