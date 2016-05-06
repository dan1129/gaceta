/**
 * TT-A068 GACETA_IPN
 * Cordova Hernandez Stephanie Abigail
 * Popoca Quintanar Daniel
 */
package com.gacetadigital.controller;


import com.gacetadigital.ejb.BorradorFacadeLocal;
import com.gacetadigital.model.Borrador;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class BorradorController implements Serializable{
    
    @EJB
    private BorradorFacadeLocal borradorEJB;
    private Borrador borrador;

    public Borrador getBorrador() {
        return borrador;
    }

    public void setBorrador(Borrador borrador) {
        this.borrador = borrador;
    }
    
    @PostConstruct
    public void init(){
        borrador = new Borrador();
    }
    
    public void mandar(){
        try{
            borradorEJB.create(borrador);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Artículo Enviado"));
        }catch(Exception e){
            //mensaje
        }
    }

}
