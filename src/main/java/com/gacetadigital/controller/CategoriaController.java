/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.controller;

import com.gacetadigital.ejb.CategoriaFacadeLocal;
import com.gacetadigital.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CategoriaController implements Serializable{
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria;
    
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void registrar(){
        try{
            categoriaEJB.edit(categoria);
        }catch (Exception e){
            //Mensaje
        }
    }
    
    public void modificar(){
        categoriaEJB.edit(categoria);
        categoria.setEstado(true);
    }
}
