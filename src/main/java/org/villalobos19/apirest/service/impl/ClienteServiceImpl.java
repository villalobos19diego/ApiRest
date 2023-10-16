package org.villalobos19.apirest.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.villalobos19.apirest.model.dao.ClienteDao;
import org.villalobos19.apirest.model.dto.ClienteDto;
import org.villalobos19.apirest.model.entity.Cliente;
import org.villalobos19.apirest.service.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> listAll() {
        return  (List) clienteDao.findAll();
    }

    @Override
    public Cliente save(ClienteDto clienteDto) {
         Cliente cliente = Cliente.builder()
                 .idCliente(clienteDto.getIdCliente())
                 .nombre(clienteDto.getNombre())
                 .apellido(clienteDto.getApellido())
                 .correo(clienteDto.getCorreo())
                 .fechaRegistro(clienteDto.getFechaRegistro())
                 .build();
         return clienteDao.save(cliente);

    }

    @Transactional(readOnly = true)
    @Override
    public  Cliente findById(Integer id){
        return clienteDao.findById(id).orElse(null);
    }

@Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }

    @Override
    public boolean existsById(Integer id) {
        return  clienteDao.existsById(id);
    }
}