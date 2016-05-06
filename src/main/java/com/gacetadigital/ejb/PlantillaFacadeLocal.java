/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.ejb;

import com.gacetadigital.model.Plantilla;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PlantillaFacadeLocal {

    void create(Plantilla plantilla);

    void edit(Plantilla plantilla);

    void remove(Plantilla plantilla);

    Plantilla find(Object id);

    List<Plantilla> findAll();

    List<Plantilla> findRange(int[] range);

    int count();
    
}
