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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/clientes/{id}")
	public ResponseEntity<Cliente> show(@PathVariable final Integer id) {
		final Optional<Cliente> response = clienteService.findById(id);
		if (response.isPresent()) {
			return new ResponseEntity<>(response.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> save(@RequestBody final Cliente cliente) {
		final Optional<Cliente> response = clienteService.save(cliente);
		return new ResponseEntity<Cliente>(response.get(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> update(@RequestBody final Cliente cliente) {
		final Optional<Cliente> response = clienteService.update(cliente);
		return new ResponseEntity<Cliente>(response.get(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cliente>> findAll() {
		final Collection<Cliente> response = clienteService.findAll();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/clientes/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable final Integer id) {
		final Optional<Cliente> response = clienteService.findById(id);
		if (!response.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		clienteService.delete(response.get());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
