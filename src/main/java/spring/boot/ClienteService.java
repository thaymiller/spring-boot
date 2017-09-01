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

public interface ClienteService {
	public Optional<Cliente> save(final Cliente cliente);
	
	public Collection<Cliente> findAll();
	
	public void delete(Cliente cliente);
	
	public Optional<Cliente> findById(Integer id);
	
	public Optional<Cliente> update(Cliente cliente);
}
