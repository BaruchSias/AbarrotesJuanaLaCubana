package mx.uach.fing.abarrotesjuana.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Baruch Sias
 */
public class Producto {
    
  public static final String TABLA = "productos";
  public static final String[] FIELDS = {"idprod", "descripcion",
  "precio", "clasificacion", "cantidad", "existmin", "existmax"};

  private Integer idprod;
  private String descripcion;
  private Double precio;
  private String clasificacion;
  private Integer cantidad;
  private Integer existmin;
  private Integer existmax;

  public Producto(Integer idprod, String descripcion, Double precio,
  String clasificacion, Integer cantidad, Integer existmin, Integer existmax)
  {
    this.idprod = idprod;
    this.descripcion = descripcion;
    this.precio = precio;
    this.clasificacion = clasificacion;
    this.cantidad = cantidad;
    this.existmin = existmin;
    this.existmax = existmax;
   }    
  
  public static String fieldsToString(){
    String fieldsStr = "";
    List<String> fieldsToConvert = Arrays.asList(FIELDS);
      for(String field:fieldsToConvert)
      {
        fieldsStr = String.format("%s, %s", fieldsStr, field);
      }
        return fieldsStr.replaceFirst(", ", "");
    }

  public Integer getIdprod()
  {
    if (this.idprod == null)
    {
      throw new NullPointerException(
        String.format("El producto %s no existe.", this.descripcion));
    }
        return idprod;
  }

  public void setIdprod(Integer idprod)
  {
    this.idprod = idprod;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }

  public Double getPrecio()
  {
    return precio;
  }

  public void setPrecio(Double precio)
  {
    this.precio = precio;
  }

  public String getClasificacion()
  {
    return clasificacion;
  }

  public void setClasificacion(String clasificacion)
  {
    this.clasificacion = clasificacion;
  }

  public Integer getCantidad()
  {
    return cantidad;
  }

  public void setCantidad(Integer cantidad)
  {
    this.cantidad = cantidad;
  }

  public Integer getExistmin()
  {
    return existmin;
  }

  public void setExistmin(Integer existmin)
  {
    this.existmin = existmin;
  }

  public Integer getExistmax()
  {
    return existmax;
  }

  public void setExistmax(Integer existmax)
  {
    this.existmax = existmax;
  }
    
  public  String cadena()
  {
    String s = "ID: " + this.idprod + ", Desc: " + this.descripcion +
    ", Class: " + this.clasificacion + ", Precio: " + this.precio;
      return s;
  }

}
