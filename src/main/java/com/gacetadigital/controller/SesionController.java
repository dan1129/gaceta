/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.controller;

import com.gacetadigital.model.Usuario;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class SesionController implements Serializable{
    
   public void verificarSesion(){
        try{
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            
            if(us == null){
                context.getExternalContext().redirect("../webapp/permiso.xhtml");
            }
        }catch(Exception e){
            //log para guardar registro de error.
        }
    }
   
public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }


    
}

