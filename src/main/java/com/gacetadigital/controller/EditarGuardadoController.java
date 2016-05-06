/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gacetadigital.controller;


import com.gacetadigital.model.Borrador;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class EditarGuardadoController implements Serializable{
    @Inject
    private ConsultarBorradoresController consultarController;    
    private Borrador borrador;
    
    @PostConstruct
    public void init(){
        this.borrador = consultarController.getBorr();
    }

    public Borrador getBorrador() {
        return borrador;
    }

    public void setBorrador(Borrador borrador) {
        this.borrador = borrador;
    }
    
}
