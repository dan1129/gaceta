package com.gacetadigital.model;

import com.gacetadigital.model.Plantilla;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-27T00:58:50")
@StaticMetamodel(Borrador.class)
public class Borrador_ { 

    public static volatile SingularAttribute<Borrador, String> breve_descripcion;
    public static volatile SingularAttribute<Borrador, Date> fecha;
    public static volatile SingularAttribute<Borrador, String> contenido;
    public static volatile SingularAttribute<Borrador, String> descripcion_img;
    public static volatile SingularAttribute<Borrador, String> subtitulo;
    public static volatile SingularAttribute<Borrador, Integer> idBorrador;
    public static volatile SingularAttribute<Borrador, String> titulo;
    public static volatile SingularAttribute<Borrador, byte[]> imagen;
    public static volatile SingularAttribute<Borrador, Plantilla> idPlantilla;
    public static volatile SingularAttribute<Borrador, String> status;

}