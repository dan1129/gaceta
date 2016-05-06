package com.gacetadigital.model;

import com.gacetadigital.model.Borrador;
import com.gacetadigital.model.Categoria;
import com.gacetadigital.model.Gaceta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-27T00:58:50")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile SingularAttribute<Articulo, Borrador> idBorrador;
    public static volatile SingularAttribute<Articulo, Integer> valorizacion;
    public static volatile SingularAttribute<Articulo, Categoria> idCategoria;
    public static volatile SingularAttribute<Articulo, Gaceta> idGaceta;
    public static volatile SingularAttribute<Articulo, String> status;

}