/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gacetadigital.ejb;

import com.gacetadigital.model.Borrador;
import java.util.List;
import javax.ejb.Local;

@Local
public interface BorradorFacadeLocal {

    void create(Borrador borrador);

    void edit(Borrador borrador);

    void remove(Borrador borrador);

    Borrador find(Object id);

    List<Borrador> findAll();

    List<Borrador> findRange(int[] range);

    int count();
    
    public Borrador guardados();
    
}
