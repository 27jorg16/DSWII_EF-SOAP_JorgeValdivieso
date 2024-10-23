package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Proveedor;
import pe.edu.cibertec.ws.objects.Proveedorws;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProveedorConvert {

    public Proveedor mapToProveedor(Proveedorws proveedorws) {
        Proveedor proveedor = new Proveedor();
        proveedor.setProveedorId(proveedorws.getProveedorId());
        proveedor.setNombreProveedor(proveedorws.getNombreProveedor());
        proveedor.setTelefonoProveedor(proveedorws.getTelefonoProveedor());
        proveedor.setCorreoProveedor(proveedorws.getCorreoProveedor());
        proveedor.setDireccionProveedor(proveedorws.getDireccionProveedor());
        return proveedor;
    }

    public Proveedorws mapToProveedorws(Proveedor proveedor) {
        Proveedorws proveedorws = new Proveedorws();
        proveedor.setProveedorId(proveedorws.getProveedorId());
        proveedor.setNombreProveedor(proveedorws.getNombreProveedor());
        proveedor.setTelefonoProveedor(proveedorws.getTelefonoProveedor());
        proveedor.setCorreoProveedor(proveedorws.getCorreoProveedor());
        proveedor.setDireccionProveedor(proveedorws.getDireccionProveedor());
        return proveedorws;
    }

    public List<Proveedor> mapToProveedorList(List<Proveedorws> proveedorwsList) {
        List<Proveedor> proveedorList = new ArrayList<>();
        for (Proveedorws proveedorws : proveedorwsList) {
            proveedorList.add(mapToProveedor(proveedorws));
        }
        return proveedorList;
    }

    public List<Proveedorws> mapToProveedorwsList(List<Proveedor> proveedorList) {
        List<Proveedorws> proveedorwsList = new ArrayList<>();
        for (Proveedor proveedor : proveedorList) {
            proveedorwsList.add(mapToProveedorws(proveedor));
        }
        return proveedorwsList;
    }
}
