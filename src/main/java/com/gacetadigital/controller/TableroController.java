
package com.gacetadigital.controller;

import com.gacetadigital.ejb.CategoriaFacadeLocal;
import com.gacetadigital.model.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@Named
@SessionScoped
public class TableroController implements Serializable {
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private List<Categoria> listac = new ArrayList();
    private DashboardModel model;
    
    @PostConstruct
    public void init(){
        listac = categoriaEJB.findAll();
        model = new DefaultDashboardModel();          
        //this.generarTablero();
    //}
   
    //public void generarTablero(){
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        int i = 0;
        for(Categoria c1 : listac){ //primera columna
            i ++;
            if(i < 4){
                column1.addWidget("W1");
            }
            model.addColumn(column1);
            for(Categoria c2 : listac){ //segunda columna
                i ++;
                if(i < 8){
                    column2.addWidget("W2");
                }
                model.addColumn(column2);
                for(Categoria c3 : listac){
                    i++;
                    if(i < 12){
                        column3.addWidget("W3");
                    }
                    model.addColumn(column3);
                }
                
            }
        }
    }
}
