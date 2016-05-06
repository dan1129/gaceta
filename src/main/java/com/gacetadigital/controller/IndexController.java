/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.controller;

import com.gacetadigital.ejb.UsuarioFacadeLocal;
import com.gacetadigital.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable {
    
    @EJB
    private UsuarioFacadeLocal EJBUsuario;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String iniciarSesion(){
        String redireccion = null;
        Usuario us;
        
        try{
            us = EJBUsuario.iniciarSesion(usuario);
            
            if(us != null){
                //Almacenar la sesión en JSF
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                if(us.getRol().equals("A")){
                    redireccion = "/views/admin/admin?faces-redirect=true";
                }else if(us.getRol().equals("E")){
                    redireccion = "/views/editor/editor?faces-redirect=true";
                }else if(us.getRol().equals("R"))
                    redireccion = "/views/revisor/revisor?faces-redirect=true";    
                 
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usario o Contraseña incorrectos"));
            }
            
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error"));
        }
        return redireccion;
    }
    
    
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    public String usuarioLogeado(){
    Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    return us.getNombre();
}
    
}

