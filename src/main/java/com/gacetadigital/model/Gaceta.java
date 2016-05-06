/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gaceta")
public class Gaceta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idGaceta;
    
    @Column(name = "tipo")
    public String tipo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    public Date fecha;
    
    @Column(name = "numero")
    public int numero;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idusuario", nullable = false)
    public Usuario idUsuario;

    public int getIdGaceta() {
        return idGaceta;
    }

    public void setIdGaceta(int idGaceta) {
        this.idGaceta = idGaceta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idGaceta;
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
        final Gaceta other = (Gaceta) obj;
        if (this.idGaceta != other.idGaceta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gaceta{" + "idGaceta=" + idGaceta + '}';
    }
    
    
}