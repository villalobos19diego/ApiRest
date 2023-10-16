package org.villalobos19.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.villalobos19.apirest.model.entity.Cliente;

public  interface   ClienteDao extends CrudRepository<Cliente, Integer> {
}
