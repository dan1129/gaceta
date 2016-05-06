/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.ejb;

import com.gacetadigital.model.Borrador;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class BorradorFacade extends AbstractFacade<Borrador> implements BorradorFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_GacetaDigital_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BorradorFacade() {
        super(Borrador.class);
    }
    
    @Override
    public Borrador guardados(){
        List<Borrador> borrador = new ArrayList();
        String consulta;
        
        try{
            consulta ="FROM borrador b WHERE b.status = 'G' ";
            Query query = em.createNamedQuery(consulta);
            
            borrador = query.getResultList();
            
        }catch(Exception e){
            throw e;
        }
        return (Borrador) borrador;
    }
    
}
