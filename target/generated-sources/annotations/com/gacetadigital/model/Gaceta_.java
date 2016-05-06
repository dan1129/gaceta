package com.gacetadigital.model;

import com.gacetadigital.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-27T00:58:50")
@StaticMetamodel(Gaceta.class)
public class Gaceta_ { 

    public static volatile SingularAttribute<Gaceta, Date> fecha;
    public static volatile SingularAttribute<Gaceta, String> tipo;
    public static volatile SingularAttribute<Gaceta, Integer> numero;
    public static volatile SingularAttribute<Gaceta, Usuario> idUsuario;
    public static volatile SingularAttribute<Gaceta, Integer> idGaceta;

}