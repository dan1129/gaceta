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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "borrador")
public class Borrador implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idBorrador;
    
    @Column(name = "titulo")
    public String titulo;
    
    @Column(name = "subtitulo")
    public String subtitulo;
    
    @Column(name = "breve_descripcion")
    public String breve_descripcion;
    
    @Column(name = "contenido")
    public String contenido;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha")
    public Date fecha;
    
    @Column(name = "imagen")
    public byte[] imagen;
    
    @Column(name = "descripcion_img")
    public String descripcion_img;
    
    @Column (name = "status")
    private String status;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idplantilla", nullable = false)
    public Plantilla idPlantilla;

    public int getIdBorrador() {
        return idBorrador;
    }

    public void setIdBorrador(int idBorrador) {
        this.idBorrador = idBorrador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getBreve_descripcion() {
        return breve_descripcion;
    }

    public void setBreve_descripcion(String breve_descripcion) {
        this.breve_descripcion = breve_descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion_img() {
        return descripcion_img;
    }

    public void setDescripcion_img(String descripcion_img) {
        this.descripcion_img = descripcion_img;
    }

    public Plantilla getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Plantilla idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idBorrador;
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
        final Borrador other = (Borrador) obj;
        if (this.idBorrador != other.idBorrador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Borrador{" + "idBorrador=" + idBorrador + '}';
    }

   
}

