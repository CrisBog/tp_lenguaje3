/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.cris.controller;

import java.util.List;
import py.edu.facitec.cris.dao.ClienteDao;
import py.edu.facitec.cris.dao.ClienteDaoImp;
import py.edu.facitec.cris.model.Cliente;

/**
 *
 * @author Cristina
 */
public class ClienteControllerImp implements ClienteController {

    private ClienteDao clienteDao;

    public ClienteControllerImp() {
        this.clienteDao = new ClienteDaoImp();
    }
    
    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDao.guardar(cliente);
    
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return clienteDao.modificar(cliente);
    }

    @Override
    public Cliente buscarClientePorCodigo(int codigo) {
       return clienteDao.buscarClientePorCodigo(codigo);
    }

    @Override
    public List<Cliente> busquedaPorParametros(String filtro) {
        return clienteDao.buscarClientePorParametros(filtro);
    }
    
}
