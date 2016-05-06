
package com.gacetadigital.controller;

import com.gacetadigital.ejb.UsuarioFacadeLocal;
import com.gacetadigital.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ConsultarUsuariosController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private List<Usuario> usuarios = new ArrayList();
    private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    @PostConstruct
    public void init(){
        usuarios = usuarioEJB.findAll();
    }
    
    public void mostrar(Usuario usuario){
        this.user = usuario;
    }
}
