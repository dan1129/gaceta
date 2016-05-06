/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idArticulo;
    
    @Column(name = "status")
    public String status;
    
    @Column(name = "valorizacion")
    public int valorizacion;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idcategoria", nullable = false)
    public Categoria idCategoria;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idborrador", nullable = false)
    public Borrador idBorrador;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idgaceta")
    public Gaceta idGaceta;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getValorizacion() {
        return valorizacion;
    }

    public void setValorizacion(int valorizacion) {
        this.valorizacion = valorizacion;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Borrador getIdBorrador() {
        return idBorrador;
    }

    public void setIdBorrador(Borrador idBorrador) {
        this.idBorrador = idBorrador;
    }

    public Gaceta getIdGaceta() {
        return idGaceta;
    }

    public void setIdGaceta(Gaceta idGaceta) {
        this.idGaceta = idGaceta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Articulo other = (Articulo) obj;
        if (this.idArticulo != other.idArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + '}';
    }
    
    
}
