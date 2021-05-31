package com.LUCIANO.Mv.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LUCIANO.Mv.domain.Cliente;
import com.LUCIANO.Mv.domain.services.exception.ObjectNotFoundException;
import com.LUCIANO.Mv.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository  repo;
	
	
	public Cliente  find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não Encontrado" + id + ",Tipo:" + Cliente.class.getName());
		}
		return obj.orElse(null);
	}

}
