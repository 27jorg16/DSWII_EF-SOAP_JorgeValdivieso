package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Producto;
import pe.edu.cibertec.ws.objects.Productows;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductoConvert {
    public Producto mapToProducto(Productows productows) {
        Producto producto = new Producto();
        producto.setProductoId(productows.getProductoId());
        producto.setNombreProducto(productows.getNombreProducto());
        producto.getDescripcionProducto(productows.getDescripcionProducto());
        producto.setPrecioProducto(productows.getPrecioProducto());
        producto.setStockProducto(productows.getStockProducto());
        return producto;
    }

    public Productows mapToProductows(Producto producto) {
        Productows productows = new Productows();
        producto.setProductoId(productows.getProductoId());
        producto.setNombreProducto(productows.getNombreProducto());
        producto.getDescripcionProducto(productows.getDescripcionProducto());
        producto.setPrecioProducto(productows.getPrecioProducto());
        producto.setStockProducto(productows.getStockProducto());
        // Agrega más campos según tu modelo
        return productows;
    }

    public List<Producto> mapToProductoList(List<Productows> productowsList) {
        List<Producto> productoList = new ArrayList<>();
        for (Productows productows : productowsList) {
            productoList.add(mapToProducto(productows));
        }
        return productoList;
    }

    public List<Productows> mapToProductowsList(List<Producto> productoList) {
        List<Productows> productowsList = new ArrayList<>();
        for (Producto producto : productoList) {
            productowsList.add(mapToProductows(producto));
        }
        return productowsList;
    }
}
