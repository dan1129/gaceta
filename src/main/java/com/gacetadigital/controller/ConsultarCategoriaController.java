
package com.gacetadigital.controller;

import com.gacetadigital.ejb.CategoriaFacadeLocal;
import com.gacetadigital.model.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ConsultarCategoriaController implements Serializable{
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private List<Categoria> categorias = new ArrayList();

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    @PostConstruct
    public void init(){
        categorias = categoriaEJB.findAll();
    }
   
}
