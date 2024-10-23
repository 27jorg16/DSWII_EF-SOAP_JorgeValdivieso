package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Cliente;
import pe.edu.cibertec.ws.objects.Clientews;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteConvert {

    public Cliente mapToCliente(Clientews clientews) {
        Cliente cliente = new Cliente();
        cliente.setClienteId(cliente.getClienteId());
        cliente.setNombreCliente(clientews.getNombreCliente());
        cliente.setDireccionCliente(clientews.getDireccionCliente());
        cliente.setTelefonoCliente(clientews.getTelefonoCliente());
        cliente.setCorreoCliente(clientews.getCorreoCliente());
        return cliente;
    }

    public Clientews mapToClientews(Cliente cliente) {
        Clientews clientews = new Clientews();
        cliente.setClienteId(cliente.getClienteId());
        cliente.setNombreCliente(clientews.getNombreCliente());
        cliente.setDireccionCliente(clientews.getDireccionCliente());
        cliente.setTelefonoCliente(clientews.getTelefonoCliente());
        cliente.setCorreoCliente(clientews.getCorreoCliente());
        return clientews;
    }

    public List<Cliente> mapToClienteList(List<Clientews> clientewsList) {
        List<Cliente> clienteList = new ArrayList<>();
        for (Clientews clientews : clientewsList) {
            clienteList.add(mapToCliente(clientews));
        }
        return clienteList;
    }

    public List<Clientews> mapToClientewsList(List<Cliente> clienteList) {
        List<Clientews> clientewsList = new ArrayList<>();
        for (Cliente cliente : clienteList) {
            clientewsList.add(mapToClientews(cliente));
        }
        return clientewsList;
    }
}
