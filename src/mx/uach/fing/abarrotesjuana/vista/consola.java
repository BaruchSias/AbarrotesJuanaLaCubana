package mx.uach.fing.abarrotesjuana.vista;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import mx.uach.fing.abarrotesjuana.dao.ProductosDao;
import mx.uach.fing.abarrotesjuana.datos.Producto;

/**
 *
 * @author Baruch Sias
 */
public class consola {

  public static void main(String[] args) {
    List<Producto> p = new ProductosDao().list();
      long r1 = p.stream()
        .filter(a -> {
        return a.getCantidad() > 20;
        })
        .count();
        System.out.println("Primer Requisito");
        System.out.println(String
        .format("Número de productos con existencia mayor a 20: %d",
        r1));
        
      long r2 = p.stream()
        .filter(a -> {
        return a.getCantidad() < 15;
        })
        .count();
        System.out.println("Segundo Requisito");
        System.out.println(String
        .format("Número de productos con existencia menor a 15: %d",
        r2));
        
        System.out.println("Tercer Requisito");
        System.out.println("Listado de productos con la misma clasificación"
        + " y precio mayor 15.50:");
        p.stream()
        .filter(a -> {return a.getPrecio() > 15.5;})
        .sorted((a, b) -> a.getClasificacion()
        .compareTo(b.getClasificacion()))
        .forEach(a -> {System.out.println(a.cadena());;});
        
        System.out.println("Cuarto Requisito");
        System.out.println("Lista de productos con precio un "
        + "mayor a 20.30 y menor a 45.00:");
        p.stream()
        .filter(a -> {return a.getPrecio() > 20.30 && a.getPrecio()< 45;})
        .forEach(a -> {System.out.println(a.cadena());});
        Map<String, Long> counted = p.stream()
        .collect(Collectors.groupingBy(o -> o.getClasificacion(),
        Collectors.counting()));
        
        System.out.println("Quinto Requisito");
        System.out.println("Número de productos agrupados"
        + " por su clasificación: ");
        System.out.println(counted);
    }

}
