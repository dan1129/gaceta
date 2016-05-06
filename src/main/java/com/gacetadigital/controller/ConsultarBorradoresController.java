/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gacetadigital.controller;


import com.gacetadigital.ejb.BorradorFacadeLocal;
import com.gacetadigital.model.Borrador;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ConsultarBorradoresController implements Serializable{
    
    @EJB
    private BorradorFacadeLocal borradorEJB;
    private List<Borrador> borradores = new ArrayList();
    private Borrador borr;

    public List<Borrador> getBorradores() {
        return borradores;
    }

    public void setBorradores(List<Borrador> borradores) {
        this.borradores = borradores;
    }

    public Borrador getBorr() {
        return borr;
    }

    public void setBorr(Borrador borr) {
        this.borr = borr;
    }    
    
    @PostConstruct
    public void init(){
        borradores = borradorEJB.findAll();
    }
    
    public void mostrar(Borrador borrador){
        this.borr = borrador;
    }
    
    
}
