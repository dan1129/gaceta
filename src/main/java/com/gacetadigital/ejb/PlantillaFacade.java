/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.ejb;

import com.gacetadigital.model.Plantilla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PlantillaFacade extends AbstractFacade<Plantilla> implements PlantillaFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_GacetaDigital_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlantillaFacade() {
        super(Plantilla.class);
    }
    
}
