/*
 * Copyright (c) 1996-2013 UOL Inc, Todos os direitos reservados
 * 
 * Este arquivo e uma propriedade confidencial do Universo Online Inc. Nenhuma
 * parte do mesmo pode ser copiada, reproduzida, impressa ou transmitida por
 * qualquer meio sem autorizacao expressa e por escrito de um representante
 * legal do Universo Online Inc.
 * 
 * All rights reserved
 * 
 * This file is a confidential property of Universo Online Inc. No part of this
 * file may be reproduced or copied in any form or by any means without written
 * permission from an authorized person from Universo Online Inc.
 */
package spring.boot;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public Optional<Cliente> save(final Cliente cliente) {
		return Optional.of(clienteRepository.save(cliente));
	}
	
	@Override
	public Collection<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	@Override
	public void delete(final Cliente cliente) {
		clienteRepository.delete(cliente.getId());
	}
	
	@Override
	public Optional<Cliente> findById(final Integer id) {
		return Optional.ofNullable(clienteRepository.findOne(id));
	}
	
	@Override
	public Optional<Cliente> update(final Cliente cliente) {
		return Optional.of(clienteRepository.save(cliente));
	}
}