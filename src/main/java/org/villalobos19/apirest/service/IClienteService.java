package org.villalobos19.apirest.service;

import org.villalobos19.apirest.model.dto.ClienteDto;
import org.villalobos19.apirest.model.entity.Cliente;

import java.util.List;

public  interface IClienteService {
    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente  findById(Integer id);


    void delete(Cliente cliente);

    boolean existsById(Integer id);

}
