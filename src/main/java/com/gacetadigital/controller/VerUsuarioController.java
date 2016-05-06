
package com.gacetadigital.controller;

import com.gacetadigital.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class VerUsuarioController implements Serializable{
    
    @Inject
    private ConsultarUsuariosController consultarController;    
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        this.usuario = consultarController.getUser();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
